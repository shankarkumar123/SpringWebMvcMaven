package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.UsersRegistration;
import com.app.service.IUsersRegisterService;

@Controller
@RequestMapping("/users")
public class UsersRegisterController {
	@Autowired
	private IUsersRegisterService service;
	
	@RequestMapping("/reg")
	public String showReg() {
		return "userregistration";
	}
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String save(@ModelAttribute UsersRegistration usersRegistration,ModelMap map) {
	
	   Integer id = service.saveUsers(usersRegistration);
	   String msg="You have successfully register with user Id:::"+id;
	   map.addAttribute("message", msg);
	   return "userregistration";
	

}
	@RequestMapping("/all")
	public String viewAll(ModelMap map) {
		
		List<UsersRegistration> obs = service.getAllUsers();
		map.addAttribute("list", obs);
		return "usersdata";
		
	}
	@RequestMapping("/delete")
	public String deleteUsers(@RequestParam("uid") int uid,ModelMap map) {
		service.deleteUsers(uid);
		List<UsersRegistration> obs = service.getAllUsers();
		map.addAttribute("list", obs);
		map.addAttribute("message", "User deleted::"+uid);
		return "usersdata";
		
	}
	@RequestMapping("/denied")
	public String denied() {
		return "denied";
		
	}
}
