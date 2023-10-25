package com.soudry.hehlma.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.soudry.hehlma.entities.Skills;

@Repository
public interface SkillRepository extends JpaRepository<Skills, String> {

    // @Query("SELECT s FROM Skills s WHERE s.characterClass = :characterClass AND s.tier = 0")
    // List<Skills> grabTier0Skills(String characterClass);

        @Query("SELECT s FROM Skills s WHERE s.tier = 0")
    List<Skills> grabTier0Skills(String characterClass);

// change the classnames of character_class make them more disinct
    //    @Query("SELECT s FROM Skills s WHERE s.character_class.character_class = 'Knight'")
    // // List<Skills> grabTier0Skills(String characterClass);
    //  List<Skills> grabTier0Skills();
}

