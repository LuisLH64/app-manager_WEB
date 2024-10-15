package com.app.manager.user;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.ServerRequest.Headers;

import com.app.manager.utils.Url;

@Service
public class UserService {

    private static final String URL = "user";
    private final RestTemplate restTemplate;

    public UserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public User findByUsername(String username, String token) {
        HttpHeaders headers = new HttpHeaders();
		headers.setBearerAuth(token);
        headers.setContentType(MediaType.APPLICATION_JSON);

        User user = restTemplate.exchange(Url.findByUsername(URL, username), HttpMethod.GET, new HttpEntity<Headers>(headers), User.class).getBody();
        return user;
    }

    public User findByEmail(String email, String token) {
        HttpHeaders headers = new HttpHeaders();
		headers.setBearerAuth(token);

        User user = restTemplate.exchange(Url.findByEmail(URL, email), HttpMethod.GET, new HttpEntity<Headers>(headers), User.class).getBody();
        return user;
    }

    

}
