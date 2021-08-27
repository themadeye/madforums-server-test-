package com.madhouse.madforums.repo;

import com.madhouse.madforums.model.Role;
import com.madhouse.madforums.model.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
