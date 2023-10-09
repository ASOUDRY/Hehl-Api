package com.soudry.hehlapi.Service;
import org.springframework.stereotype.Service;

import com.soudry.hehlapi.Models.*;

@Service
public class PlayerService {

    public Player retunPlayer() {
        return new Player();
    }
}
