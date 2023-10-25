package com.soudry.hehlma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import com.soudry.hehlma.Models.Character;
// import com.soudry.hehlma.Models.*;
// import com.soudry.hehlma.Models.Character;
import com.soudry.hehlma.Service.*;
import com.soudry.hehlma.dtos.requests.CharacterRequest;
// import com.soudry.hehlma.entities.Characters;
// import com.soudry.hehlma.Models.Character;

@RestController
@RequestMapping("/player")
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

    // @GetMapping("/getPlayer")
    // public ResponseEntity<Character> getPlayer() {
    //     try {
    //         Character character = characterServiceService.retunPlayer();
    //         if (player != null) {
    //             return ResponseEntity.ok(player);
    //         } else {
    //             return ResponseEntity.notFound().build();
    //         }
    //     } catch (Exception e) {
    //         return ResponseEntity.badRequest().build();
    //     }
    // }
}
