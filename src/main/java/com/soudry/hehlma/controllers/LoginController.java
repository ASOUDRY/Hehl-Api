package com.soudry.hehlma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.soudry.hehlma.Service.LoginService;
import com.soudry.hehlma.dtos.requests.LoginRequest;
import com.soudry.hehlma.dtos.responses.LoginResponse;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "*", allowedHeaders = "*" )
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest login) {
    LoginResponse loginObject = loginService.loginUser(login);
    return ResponseEntity.ok(loginObject);
    }
}
