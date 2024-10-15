package com.app.manager.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private Long id;
    private String name;
    private String username;
    private String email;
    private Role role;
}
