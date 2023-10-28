package com.soudry.hehlma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.soudry.hehlma.Service.RegistrationService;
import com.soudry.hehlma.dtos.requests.RegistrationRequest;

import org.springframework.http.ResponseEntity;
import com.soudry.hehlma.dtos.responses.RegistrationAttempt;


@RestController
@RequestMapping("/registration")
public class RegistrationController {

    private final RegistrationService registrationService;

    @Autowired
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/register")
    public ResponseEntity<RegistrationAttempt> register(@RequestBody RegistrationRequest body) {
    RegistrationAttempt registerResponse = registrationService.registerUser(body);

        if (registerResponse.getSuccess()) {
        return ResponseEntity.ok(registerResponse);
        } else {
        return ResponseEntity.badRequest().build();
        }
    }
}
