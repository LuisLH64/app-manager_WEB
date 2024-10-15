package com.app.manager.login;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.ServerRequest.Headers;

// import com.app.manager.security.AuthenticatedUser;
import com.app.manager.utils.Url;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.Nullable;
import com.vaadin.hilla.crud.FormService;

import jakarta.annotation.security.PermitAll;

@BrowserCallable
public class LoginService {

    // private final AuthenticatedUser authenticatedUser;
    private final RestTemplate restTemplate;

    public LoginService(/*AuthenticatedUser authenticatedUser,*/ 
                        RestTemplate restTemplate) 
    {
        // this.authenticatedUser = authenticatedUser;
        this.restTemplate = restTemplate;
    }

    @PermitAll
    public String doLogin(UserLogin userLogin) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        return restTemplate.postForObject(Url.login(), userLogin, TokenLogin.class).getToken();
    }
    

    
}
