package com.soudry.hehlma.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.soudry.hehlma.entities.Skills;

@Repository
public interface SkillRepository extends JpaRepository<Skills, String> {

@Query("SELECT s FROM Skills s WHERE s.characterClass = :characterClass AND s.tier = 0")
List<Skills> grabTier0Skills(@Param("characterClass") String characterClass);

@Query("SELECT s FROM Skills s " +
       "JOIN CharacterSkills cs ON s.skillName = cs.skills.skillName " +
       "JOIN Characters c ON cs.character.id = c.id " +
       "WHERE c.characterName = :characterName")
List<Skills> getPersonalSkills(@Param("characterName") String characterName);



}