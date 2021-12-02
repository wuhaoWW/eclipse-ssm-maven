package com.mytest.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mytest.ssm.pojo.UserInfo;
import com.mytest.ssm.service.UserService;

/**
 * 
 * 用户控制器
 * */
@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	 private UserService userService;
	@RequestMapping("/view")
	public String view() {
		return "main/login";
	}
	 @RequestMapping("/indexview")
	 public String index() {
	  return "main/index";
	 }
	 @RequestMapping(value = "/login", method = RequestMethod.POST)
	 public ModelAndView login(String username,String password, HttpSession session) {
		 UserInfo user = userService.findByUsername(username);
	  if (user == null || !user.getPassword().equals(password)) {
	   return new ModelAndView("redirect:/login.jsp");
	  } else {
	   session.setAttribute("user", user);
	   ModelAndView mav = new ModelAndView();
	   mav.setViewName("index");
	   return mav;
	  }
	 }
}
