package greatui.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import greatui.backend.models.RegisteredUser;
import greatui.backend.models.User;
import greatui.backend.repo.RegisteredRepo;
import greatui.backend.repo.UserRepo;

@Service
public class BackendService {

	@Autowired
	private RegisteredRepo regR;
	
	@Autowired
	private UserRepo userR;
	
	public BackendService(UserRepo userR, RegisteredRepo regR) {
		this.regR = regR;
		this.userR = userR;
	}
	
	public User createUser(User u) {
		return userR.save(u);
	}
	
	public List<User> getAllUsers() {
		return userR.findAll();
	}
	
	public User getUserByUsername(String username) {
		return userR.findByUsername(username);
	}
	
	public RegisteredUser updateRegUser(RegisteredUser regUser) {
		return regR.save(regUser);
	}
	
	public RegisteredUser createRegisteredUser(RegisteredUser regUser) {
		return regR.save(regUser);
	}
	
	public User updateUser(User u) {
		return userR.save(u);
	}
}
