package com.soudry.hehlapi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soudry.hehlapi.dtos.requests.LoginRequest;
import com.soudry.hehlapi.dtos.responses.LoginResponse;
import com.soudry.hehlapi.entities.User;
import com.soudry.hehlapi.repositories.UserRepository;

@Service
public class LoginService {

    private final UserRepository userRepository;

    @Autowired
    public LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public LoginResponse loginUser(LoginRequest lr) {
       User retreivedUser = userRepository.findById(lr.getUsername()).get();
        // Hash password
        return new LoginResponse(retreivedUser.getUsername(), retreivedUser.getIsAdmin());
    }
    
}
