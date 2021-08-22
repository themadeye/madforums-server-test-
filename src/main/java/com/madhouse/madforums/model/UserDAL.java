package com.madhouse.madforums.model;

import java.util.List;
import com.madhouse.madforums.model.User;

public interface UserDAL {
    List<User> getAllUsers();
}
