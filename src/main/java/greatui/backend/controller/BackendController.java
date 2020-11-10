package greatui.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import greatui.backend.models.RegisteredUser;
import greatui.backend.models.User;
import greatui.backend.service.BackendService;

@RestController
@CrossOrigin
@RequestMapping("/bestever")
public class BackendController {

	@Autowired
	private BackendService bs;
	
	public BackendController(BackendService bs) {
		this.bs=bs;
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return bs.getAllUsers();
	}
	
	@PostMapping("/registerUser")
	public User registerUser(@RequestBody User u) {
		return bs.createUser(u);
	}
	
	@PostMapping("/updateRegisteredUser")
	public RegisteredUser updateRegistered(@RequestBody RegisteredUser regUser) {
		return bs.updateRegUser(regUser);
	}
	
	@PostMapping("/createRegisteredUser")
	public RegisteredUser createRegUser(@RequestBody RegisteredUser regUser) {
		User u = regUser.getMyUser();
		RegisteredUser reg = bs.createRegisteredUser(regUser);
		u.setReg(regUser);
		bs.updateUser(u);
		return reg;
	}
	
	@PostMapping("/getRegistered")
	public RegisteredUser getRegistered(User u) {
		User user = bs.getUserByUsername(u.getUsername());
		if(user == null || !user.getPassword().equals(u.getPassword())) {
			return new RegisteredUser(-1, "Invalid Password", "", "", "", "", null);
		} else {
			return user.getReg();
		}
	}
	
}
