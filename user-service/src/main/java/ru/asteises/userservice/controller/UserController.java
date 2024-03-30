package ru.asteises.userservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {

    @GetMapping("/welcome")
    public ResponseEntity<String> getWelcomePage() {
        return new ResponseEntity<>("Welcome to welcome page :)", HttpStatus.OK);
    }

    @GetMapping("/users")
    @PreAuthorize("hasAnyAuthority('USER', 'ADMIN')")
    public ResponseEntity<String> getUsersPage() {
        return new ResponseEntity<>("Welcome to ONLY users page :)", HttpStatus.OK);
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<String> getAdminPage() {
        return new ResponseEntity<>("Welcome to ONLY admin page :)", HttpStatus.OK);
    }

    @GetMapping("/all")
    @PreAuthorize("hasAnyAuthority('USER', 'ADMIN')")
    public ResponseEntity<String> getPageForAll() {
        return new ResponseEntity<>("Welcome to page for all :)", HttpStatus.OK);
    }
}
