// package com.app.manager.security;

// import java.util.Arrays;
// import java.util.List;

// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;

// import com.app.manager.login.LoginService;
// import com.app.manager.user.User;
// import com.app.manager.user.UserService;

// @Service
// public class UserDetailsServiceImpl implements UserDetailsService {

//     private final LoginService loginService;

//     public UserDetailsServiceImpl(LoginService loginService) {
//         this.loginService = loginService;
//     }

//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         loginService.doLogin();
        
//         if (null == null) {
//             throw new UsernameNotFoundException("No user present with username: " + username);
//         } 
//         else {
//             return new org.springframework.security.core.userdetails.User("", "", getAuthorities(null));
//         }
//     }

//     private static List<GrantedAuthority> getAuthorities(User user) {
    
//         return Arrays.asList(new SimpleGrantedAuthority(user.getRole().name()));
//     }

// }
