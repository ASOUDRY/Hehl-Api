package com.soudry.hehlma.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soudry.hehlma.Models.Skill;
import com.soudry.hehlma.entities.CharacterSkills;
import com.soudry.hehlma.entities.Characters;
import com.soudry.hehlma.entities.Skills;
import com.soudry.hehlma.repositories.CharacterSkillRepository;
import com.soudry.hehlma.repositories.SkillRepository;

@Service
public class SkillService {
    private final SkillRepository skillrepo;
    private final CharacterSkillRepository characterSkillRepository;
    private final EntityToDTOService etd;

    @Autowired
    public SkillService(SkillRepository skillrepo, EntityToDTOService etd, CharacterSkillRepository characterSkillRepository) {
        this.skillrepo = skillrepo;
        this.etd = etd;
        this.characterSkillRepository = characterSkillRepository;
    }

    public List<Skill> acquireBaseSkills(String characterClass, Characters characters) {
       
        List<Skills> skills = skillrepo.grabTier0Skills(characterClass);
        for (Skills s1 : skills) {
            logSkills(s1, characters);
        }
        List<Skill> convertedSkills = etd.convertSkills(skills);
        return convertedSkills;
    }

    private void logSkills(Skills skills, Characters characters) {
                CharacterSkills ck = new CharacterSkills(characters, skills);
                characterSkillRepository.saveAndFlush(ck);           
    }
    
}
