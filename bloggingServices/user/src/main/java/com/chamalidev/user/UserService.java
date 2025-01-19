package com.chamalidev.user;

import org.springframework.stereotype.Service;

@Service
public record UserService() {
    public void registerUser(UserRegistrationRequest request) {
        User user = User.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        //todo: check if email valid
        //todo: check if email not taken
        //todo: store customer in db
    }
}
