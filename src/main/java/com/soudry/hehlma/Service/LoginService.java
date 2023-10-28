package com.soudry.hehlma.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soudry.hehlma.dtos.requests.LoginRequest;
import com.soudry.hehlma.dtos.responses.LoginResponse;
import com.soudry.hehlma.entities.User;
import com.soudry.hehlma.repositories.UserRepository;

@Service
public class LoginService {

    private final UserRepository userRepository;
    private final EntityToDTOService ets;

    @Autowired
    public LoginService(UserRepository userRepository, EntityToDTOService ets) {
        this.userRepository = userRepository;
        this.ets = ets;
    }

    public LoginResponse loginUser(LoginRequest lr) {
        User retreivedUser = userRepository.getReferenceById(lr.getUsername());
        return new LoginResponse(retreivedUser.getUsername(), retreivedUser.getIsAdmin(), ets.retreiveCharacters(retreivedUser));
    } 
}
