package com.madhouse.madforums.security.services;

import com.madhouse.madforums.model.User;
import com.madhouse.madforums.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.transaction.Transactional;

public class UserDetailsServiceImpl implements UserDetailsService {

  @Autowired
  UserRepo userRepo;

  @Override
  @Transactional
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userRepo.findByUserName(username).orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
    return UserDetailsImpl.build(user);
  }
}
