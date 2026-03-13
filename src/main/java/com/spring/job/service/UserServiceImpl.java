package com.spring.job.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.job.entity.User;
import com.spring.job.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	 @Autowired
	    private UserRepository urepo;


	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		urepo.save(user);
		
	} 

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return urepo.findAll();
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return urepo.findById(id).orElse(null);
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		urepo.deleteById(id);
		
	}
	
	@Override
	public User findByEmail(String email) {
	    return urepo.findByEmail(email);

}
}
