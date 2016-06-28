package com.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin")
public class UserController {
	
	@RequestMapping(value="list")
	public String list(Model model){
		model.addAttribute("sen", "sensen");
		return "admin/list";
	}

}
