package com.soudry.hehlma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soudry.hehlma.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
    
}
