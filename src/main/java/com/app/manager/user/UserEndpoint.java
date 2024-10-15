// package com.app.manager.user;

// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;

// import com.app.manager.security.AuthenticatedUser;
// import com.vaadin.flow.server.auth.AnonymousAllowed;
// import com.vaadin.hilla.Endpoint;

// @Endpoint
// @AnonymousAllowed
// public class UserEndpoint {

//     @Autowired
//     private AuthenticatedUser authenticatedUser;

//     public Optional<User> getAuthenticatedUser() {
//         System.err.println("passou aqui");
//         return authenticatedUser.get();
//     }
// }
