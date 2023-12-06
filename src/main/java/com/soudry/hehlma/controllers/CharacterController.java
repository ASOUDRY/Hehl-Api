package com.soudry.hehlma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import com.soudry.hehlma.Models.Character;
import com.soudry.hehlma.Service.*;
import com.soudry.hehlma.dtos.requests.CharacterRequest;


@RestController
@RequestMapping("/player")
@CrossOrigin(origins = "*", allowedHeaders = "*" )
public class CharacterController {

    private final CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @PostMapping("/createCharacter")
    public ResponseEntity<Character> createCharacter(@RequestBody CharacterRequest character) {
       Character createdCharacter = characterService.createCharacter(character);
       return ResponseEntity.ok(createdCharacter);
    }
}
