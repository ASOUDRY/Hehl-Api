package com.soudry.hehlma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soudry.hehlma.entities.Characters;

@Repository
public interface CharacterRepository extends JpaRepository<Characters, String> {
    
}
