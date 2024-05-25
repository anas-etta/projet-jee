package com.e_clothing.jee.repository;

import com.e_clothing.jee.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
