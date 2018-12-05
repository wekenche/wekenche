package com.wekenche.controller.users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	@GetMapping
	public String list(ModelMap model) {
		model.addAttribute("userList","wewewe");
		return "users/index";
	}
}
