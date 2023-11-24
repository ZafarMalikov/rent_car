package com.example.rentcar2.user;

import com.example.rentcar2.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<User,UUID> {
    User findUserByUsername(String name);
}
