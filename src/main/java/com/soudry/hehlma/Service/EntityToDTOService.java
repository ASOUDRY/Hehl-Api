package com.soudry.hehlma.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.soudry.hehlma.entities.Characters;
import com.soudry.hehlma.entities.Skills;
import com.soudry.hehlma.Models.Character;
import com.soudry.hehlma.entities.User;
import com.soudry.hehlma.Models.Skill;

@Service
public class EntityToDTOService {

    public List<Character> convertForm(User user) {
       List<Characters> li = user.getCharacters();
       List<Character> listOfCharacters = li.stream()
        .map(EntityToDTOService::helperMethod)
        .collect(Collectors.toList());
    return listOfCharacters;
    }

    public List<Skill> convertSkills(List<Skills> skills) {
            List<Skill> processSkills = skills.stream()
            .map(EntityToDTOService::skillsToSkill)
            .collect(Collectors.toList());
    return processSkills;
    }

     private static Character helperMethod(Characters charbit) {
        List<Skill> placeholder = new ArrayList<>();
        return new Character(charbit.getCharacterName(),charbit.getAttack(), charbit.getDefense(), charbit.getHitpoints(), charbit.getCharacterClass().getCharacterClass(), charbit.getIncome(), placeholder);
    }

       private static Skill skillsToSkill(Skills charbit) {
        System.out.println(charbit.getName());
        return new Skill(charbit.getAttack(), charbit.getDefense(), charbit.getHp(), charbit.getIspassive(), charbit.getPower());
    }
    
}
