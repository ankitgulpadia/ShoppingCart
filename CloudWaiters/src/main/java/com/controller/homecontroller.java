package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.UserDao;
import com.dao.User_Roles;
import com.model.Authority;
import com.model.User;

@Controller
public class homecontroller

{
@Autowired 
UserDao userdao;
@Autowired
User_Roles authroritiesRole;

	@RequestMapping("/")
	public String index()
	{
		return "index";
		
	}
	@RequestMapping("/index")
	public String indexpage()
	{
		return "index";
		
	}
	@RequestMapping("/Contact")
	public String contact()
	{
		return "contactus";
		
	}
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
	@RequestParam(value = "logout", required = false) String logout) {
	 
	       ModelAndView model = new ModelAndView();
	     if (error != null) {
	     model.addObject("error", "Invalid username and password!");
	  }
	 
	         if (logout != null) {
	        model.addObject("msg", "You've been logged out successfully.");
	    }
	         model.setViewName("login");
	 
	      return model;
	 
	 
	}
	/*@RequestMapping("/admin")
	public String admin()
	{
		return "admin";
	}*/

   

    @RequestMapping(value="/sigin", method = RequestMethod.GET)
	public ModelAndView showRegister()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("user",new User());   //new User() is a constructor and this create the object  and the object reference name is small user and adding the reference to the mav object
		                                         //it is reference by class
		
		mav.setViewName("sigin");  //view name   //jsp reference with its name
		return mav; //  2222))) but it return an object this object holds the reference of the view name and the model name  ..thats why we take ModelAndView Class 
		
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public ModelAndView saveRegister(@ModelAttribute("user") User user, BindingResult result)   //BindingResult is used to validation
	{
		ModelAndView mav=new ModelAndView();
		if(result.hasErrors())
		{
			mav.setViewName("sigin");
			 return mav;
		}
		else
		{
			//user.setRole("ROLE_USER");
			                              //setRole will set the role of the user whether it is guest user or admin  //that's why the role is not defined in index page  ..in input box 
			userdao.saveUser(user);
			Authority role=new Authority();
			role.setRole("ROLE_USER");
			role.setRole_id(user.getId());
			role.setUsername(user.getUsername());
			
			authroritiesRole.addRole(role);                                 //calling insertUser()  method that is written in UserDaoImpl class from controller class
			mav.setViewName("redirect:/login");  //means after the registration  is completed the SignIn page is loaded
		   return mav;
			
		}
		
	}
    }

