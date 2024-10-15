// package com.app.manager.security;

// import java.util.Optional;

// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.stereotype.Component;

// import com.app.manager.login.LoginService;
// import com.app.manager.user.User;
// import com.app.manager.user.UserService;
// import com.vaadin.flow.spring.security.AuthenticationContext;

// @Component
// public class AuthenticatedUser {

//     private final AuthenticationContext authenticationContext;
//     private final UserService userService;
//     private final LoginService loginService;

//     public AuthenticatedUser(AuthenticationContext authenticationContext,
//                              UserService userService,
//                              LoginService loginService)
//     {
//         this.authenticationContext = authenticationContext;
//         this.userService = userService;
//         this.loginService = loginService;
//     }

//     // public User get() {
//     //     Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//     //     System.err.println("ekfnmeiknfeinfgeinfg");
//     //     return authenticationContext.getAuthenticatedUser(UserDetails.class)
//     //             .map(userDetails -> userService.findByUsername(userDetails.getUsername()));
//     // }

//     public void logout() {
//         authenticationContext.logout();
//     }

// }
