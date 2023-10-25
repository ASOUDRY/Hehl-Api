package com.soudry.hehlma.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soudry.hehlma.dtos.requests.LoginRequest;
import com.soudry.hehlma.dtos.responses.LoginResponse;
// import com.soudry.hehlma.dtos.responses.TestResponse;
import com.soudry.hehlma.entities.User;
import com.soudry.hehlma.repositories.UserRepository;
// import java.util.List;
// import com.soudry.hehlma.entities.Characters;
// import com.soudry.hehlma.Models.Character;
// import com.soudry.hehlma.Service.EntityToDTOService;

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
       User retreivedUser = userRepository.findById(lr.getUsername()).get();
        // Hash password
    
        return new LoginResponse(retreivedUser.getUsername(), retreivedUser.getIsAdmin(), ets.convertForm(retreivedUser));
    }


    // public TestResponse loginAndGetCharacters(LoginRequest lr) {
    //    User user = userRepository.findById(lr.getUsername()).get();
    //     return new TestResponse(ets.convertForm(user));
    // }

   
    
}
