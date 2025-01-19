package com.chamalidev.user;

public record UserRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
