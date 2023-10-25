package com.soudry.hehlma.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soudry.hehlma.Factory.CharacterFactory;
import com.soudry.hehlma.Models.Character;
import com.soudry.hehlma.dtos.requests.CharacterRequest;
import com.soudry.hehlma.entities.CharacterClass;
import com.soudry.hehlma.entities.Characters;
// import com.soudry.hehlma.entities.Skills;
import com.soudry.hehlma.entities.User;
import com.soudry.hehlma.repositories.CharacterRepository;
import com.soudry.hehlma.repositories.UserRepository;
import com.soudry.hehlma.repositories.RoleRepository;
import com.soudry.hehlma.Models.Skill;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;
    private final RoleRepository roleRepository;
    private final UserRepository userRepository;
    private final SkillService skillService;

    @Autowired
    public CharacterService(CharacterRepository characterRepository, RoleRepository roleRepository, UserRepository userRepository, SkillService skillService) {
        this.characterRepository = characterRepository;
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
        this.skillService = skillService;
    }

    public Character createCharacter(CharacterRequest characterRequest) {
     Character character = CharacterFactory.decideCharacterClass(characterRequest.getCharacterClass());
     character.setCharacterName(characterRequest.getCharacterName());
     CharacterClass role = roleRepository.getReferenceById(character.getCharacterClass());
     User user = userRepository.getReferenceById(characterRequest.getUsername());
     Characters createdCharacter = new Characters(character); 
     createdCharacter.setCharacterClass(role);
     createdCharacter.setUser(user);
     characterRepository.save(createdCharacter);

        // access Skill Service return finished character
        List<Skill> listOfSkills = skillService.acquireBaseSkills(character.getCharacterClass());
        character.setSkills(listOfSkills);

     return character;
    }

   
}
