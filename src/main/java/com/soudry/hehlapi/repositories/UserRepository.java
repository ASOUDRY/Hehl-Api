package com.soudry.hehlapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soudry.hehlapi.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
    
}
