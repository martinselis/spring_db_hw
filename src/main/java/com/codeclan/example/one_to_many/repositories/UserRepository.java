package com.codeclan.example.one_to_many.repositories;

import com.codeclan.example.one_to_many.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
