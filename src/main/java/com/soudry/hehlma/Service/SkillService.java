package com.soudry.hehlma.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soudry.hehlma.Models.Skill;
import com.soudry.hehlma.entities.Skills;
import com.soudry.hehlma.repositories.SkillRepository;

@Service
public class SkillService {
    private final SkillRepository skillrepo;
    private final EntityToDTOService etd;

    @Autowired
    public SkillService(SkillRepository skillrepo, EntityToDTOService etd) {
        this.skillrepo = skillrepo;
        this.etd = etd;
    }

    public List<Skill> acquireBaseSkills(String characterClass) {
        System.out.println(characterClass);
        List<Skills> skills = skillrepo.grabTier0Skills(characterClass);
        // List<Skills> skills = skillrepo.grabTier0Skills();
        // skillrepo.
        List<Skill> convertedSkills = etd.convertSkills(skills);
        return convertedSkills;
    }
    
}
