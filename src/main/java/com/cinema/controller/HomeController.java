package com.cinema.controller;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cinema.dto.UserDTO;
import com.cinema.entity.UserInfoEntity;
import com.cinema.mapper.UserMapper;
import com.cinema.service.UserService;
import com.cinema.service.UserInfoService;

@Controller
public class HomeController {

	@Autowired private UserService userService;
	@Autowired private UserInfoService userInfoService;
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
//	@PreAuthorize("isAnonymous()")
	@GetMapping("/login")
	public String showLogin(Principal principal) {
		return principal == null ? "login-form" : "redirect:/";
	}
	
	@GetMapping("/register")
	public String showRegister(Model model) {
		model.addAttribute("registerModel", new UserDTO());
		return "register-form";
	}
	
	@PostMapping("/register")
	public String registerUser(@Valid @ModelAttribute("registerModel") UserDTO userDTO, BindingResult br) {
		if(br.hasErrors()) {
			return "register-form";
		}
		userService.save(UserMapper.convertToUser(userDTO));
		return "redirect:/";
	}
	
	@GetMapping("/user/edit")
	public String showUserInfoForm(Model model) {
		model.addAttribute("userInfoModel", new UserInfoEntity());
		return "user-details";
	}
	
	@PostMapping("/user/edit")
	public String saveUserInfo(@ModelAttribute("userInfoModel") UserInfoEntity userInfo) {
		userInfoService.save(userInfo);
		return "redirect:/";
	}
	
	
	//------------------------
	
	@GetMapping("/admin")
	public String showAdmin() {
		return "admin";
	}
	
	@GetMapping("/user")
	public String showUser(Principal principal, Model model) {
		System.out.println("Username: " + principal.getName());
		model.addAttribute("userProfile", 
				userService.findByEmail(principal.getName()));
		return "user";
	}
	
	@GetMapping("/403")
	public String showAccessDenied() {
		return "403";
	}
	
//	@PreAuthorize("isAnonymous()")
//	@PreAuthorize("isAuthenticated()")
//	@PreAuthorize("hasRole('ROLE_USER')")
}
