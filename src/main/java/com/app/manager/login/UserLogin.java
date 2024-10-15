package com.app.manager.login;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLogin {

    public UserLogin() {}

    public UserLogin(String username, 
                     String password) 
    {
        this.username = username;
        this.password = password;
    }
    
    private String username;
    private String password;
}
