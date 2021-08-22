package com.madhouse.madforums.repo;

import com.madhouse.madforums.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {

}
