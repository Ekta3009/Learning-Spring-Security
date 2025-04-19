package com.example.SpringSecurity.repo;

import com.example.SpringSecurity.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserRepo extends JpaRepository<User, Integer> {
    User getUserByUsername(String username);
}
