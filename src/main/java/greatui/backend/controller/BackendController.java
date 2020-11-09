package greatui.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
}
