package com.app.manager.security;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import com.app.manager.login.LoginService;
import com.app.manager.login.UserLogin;
import com.app.manager.user.User;
import com.app.manager.user.UserService;
import com.app.manager.utils.StringUtils;

@Component
public class UserDetailsValidate implements AuthenticationProvider {

    private final LoginService loginService;
    private final UserService userService;

    public UserDetailsValidate(LoginService loginService, 
                               UserService userService) 
    {
        this.loginService = loginService;
        this.userService = userService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        final String username = authentication.getPrincipal().toString();
        final String password = authentication.getCredentials().toString();

        if(StringUtils.isNullOrBlank(username) || StringUtils.isNullOrBlank(password)){
            throw new BadCredentialsException("Usuário ou senha inválidos");
        }

        String token;
        try {
            token = loginService.doLogin(new UserLogin(username, password));
        } 
        catch (Exception e) {
            throw new BadCredentialsException("Usuário ou senha inválidos");
        }

        User user;
        if(StringUtils.isEmail(username)) 
            user = userService.findByEmail(username, token);
        
        else 
            user = userService.findByUsername(username, token);

        List<GrantedAuthority> autorizacao = Arrays.asList(new SimpleGrantedAuthority(user.getRole().name()));

        UsernamePasswordAuthenticationToken passwordToken = new UsernamePasswordAuthenticationToken(user, authentication.getCredentials(), autorizacao);
        passwordToken.setDetails(authentication.getDetails());

        return passwordToken;
        
    }

    @Override
    public boolean supports(Class<?> authentication) {

        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
    
}
