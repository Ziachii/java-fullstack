package com.mycode.javafullstack.repository;

import com.mycode.javafullstack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
