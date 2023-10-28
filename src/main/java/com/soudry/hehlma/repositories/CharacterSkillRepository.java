package com.soudry.hehlma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soudry.hehlma.entities.CharacterSkills;

@Repository
public interface CharacterSkillRepository extends JpaRepository<CharacterSkills, String > {

    
}