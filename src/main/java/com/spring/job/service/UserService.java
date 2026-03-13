package com.spring.job.service;

import java.util.List;

import com.spring.job.entity.User;

public interface UserService {
	void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void deleteUser(Long id);
    
    User findByEmail(String email);

}
