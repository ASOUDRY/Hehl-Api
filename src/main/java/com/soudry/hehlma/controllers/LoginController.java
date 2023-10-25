package com.soudry.hehlma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.soudry.hehlma.Service.LoginService;
import com.soudry.hehlma.dtos.requests.LoginRequest;
import com.soudry.hehlma.dtos.responses.LoginResponse;
// import com.soudry.hehlma.dtos.responses.TestResponse;
// import com.soudry.hehlma.entities.User;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/login")
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
        // return ResponseEntity.badRequest().build();
    }

    // @PostMapping("/loginWithCharacter")
    // public ResponseEntity<TestResponse> login2(@RequestBody LoginRequest login) {
    // TestResponse t1 = loginService.loginAndGetCharacters(login);
    // return ResponseEntity.ok(t1);
    // // return ResponseEntity.ok().build();
    //     // return ResponseEntity.badRequest().build();
    // }
}
