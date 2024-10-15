package com.app.manager.utils;

public final class Url {

    private static String URL = "http://127.0.0.1:5000/";

    private Url() {}

    public static String login() {

        return URL + "/login";
    }

    public static String findAll(String s) {

        return URL + s + "/find/all";
    }

    public static String findById(String s, Long id) {

        return URL + s + "/find/by-id/" + id;
    }

    public static String findByUsername(String s, String username) {

        return URL + s + "/find/by-username?username=" + username;
    }

    public static String findByEmail(String s, String email) {

        return URL + s + "/find/by-email?email=" + email;
    }


    
}
