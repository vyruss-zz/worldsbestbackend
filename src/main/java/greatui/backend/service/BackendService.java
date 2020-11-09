package greatui.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		userR.save(u);
	}
}
