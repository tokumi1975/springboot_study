package main.java.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.java.entity.Users;
import main.java.service.ShowUsersService;

@Controller
public class ShowUsersController {
	@Autowired
	ShowUsersService showUsersService;

	@RequestMapping(value = "/user/list", method = RequestMethod.GET)
	public String displayList(Model model) {
		List<Users> userlist = showUsersService.searchAll();
		model.addAttribute("userlist", userlist);
		return "user/list";
	}
}
