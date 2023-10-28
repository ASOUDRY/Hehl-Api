package com.soudry.hehlma.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soudry.hehlma.entities.Characters;
import com.soudry.hehlma.entities.Skills;
import com.soudry.hehlma.Models.Character;
import com.soudry.hehlma.entities.User;
import com.soudry.hehlma.repositories.SkillRepository;
import com.soudry.hehlma.Models.Skill;

@Service
public class EntityToDTOService {

    private final SkillRepository skillRepository;

    @Autowired
    public EntityToDTOService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public List<Character> retreiveCharacters(User user) {
       List<Characters> list = user.getCharacters();
       List<Character> listOfCharacters = list.stream()
        .map((charbit) -> {
        List<Skills> listOfSkills = skillRepository.getPersonalSkills(charbit.getCharacterName());
        List<Skill> convertedSkills = convertSkills(listOfSkills);
        return new Character(charbit.getId(),charbit.getCharacterName(),charbit.getAttack(), charbit.getDefense(), charbit.getHitpoints(), charbit.getCharacterClass().getCharacterClass(), charbit.getIncome(), convertedSkills);
        }
        )
        .collect(Collectors.toList());
        return listOfCharacters;
    }

    public List<Skill> convertSkills(List<Skills> skills) {
            List<Skill> processSkills = skills.stream()
            .map(EntityToDTOService::skillsToSkill)
            .collect(Collectors.toList());
    return processSkills;
    }

     

       private static Skill skillsToSkill(Skills charbit) {
        Skill skill = new Skill(charbit.getName(),charbit.getAttack(), charbit.getDefense(), charbit.getHp(), charbit.getIspassive(), charbit.getPower());
        System.out.println("The skills name is: " + skill.getName());
        return skill;
    }
    
}
