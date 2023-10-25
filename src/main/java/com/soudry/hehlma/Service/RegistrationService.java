package com.soudry.hehlma.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soudry.hehlma.dtos.requests.RegistrationRequest;
import com.soudry.hehlma.dtos.responses.RegistrationAttempt;
import com.soudry.hehlma.entities.User;
import com.soudry.hehlma.repositories.UserRepository;
@Service
public class RegistrationService {

    private final UserRepository userRepository;

    @Autowired
    public RegistrationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public RegistrationAttempt registerUser(RegistrationRequest body) {

        // Check if username exists
       Boolean alreadyExists = userRepository.existsById(body.getUsername());
            if (!alreadyExists) {
                userRepository.save(new User(body.getUsername(), body.getPassword(), body.getEmail()));
                return new RegistrationAttempt("Successfully Registered", true);  
            }
            else {
                return new RegistrationAttempt("", false);
            }
    }
}
