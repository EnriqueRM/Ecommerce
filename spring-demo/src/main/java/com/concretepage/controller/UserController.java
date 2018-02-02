package com.concretepage.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.concretepage.service.IUserService;
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private  IUserService service;
	@RequestMapping(value="/home")
	public String home(ModelMap model, Authentication authentication) {
		authentication.getPrincipal();
		model.addAttribute("user", service.getDataByUserName(authentication.getName()));
 		return "user-info";
 	}
	
	@RequestMapping(value="/privada")
	public String privada(ModelMap model, Authentication authentication) {
		authentication.getPrincipal();
		model.addAttribute("user", service.getDataByUserName(authentication.getName()));
 		return "zona-privada";
 	}
	
	@RequestMapping(value="/error")
	public String error() {
 		return "access-denied";
 	}
}	 