package com.madhouse.madforums.repo;

import com.madhouse.madforums.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
  Optional<User> findByUserName(String userName);
  Boolean existByUsername(String userName);
  Boolean existByEmail(String email);
}
