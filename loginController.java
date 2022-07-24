package com.in28minutes.springboot.web.springbootfirstwebapplication.loginController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// </login =>> "Welcome to login Page"

//It spring boot will pick the class to send request or get request
@Controller
public class loginController {
	
	//when we write this annotation it will map with url like[ https:8089/login/ ]
	@RequestMapping("/login")
	//@ResponseBody // this will load the return data
	public String login( @RequestParam String name,ModelMap model ){
		System.out.println("Nmae is = " + name);
		//this will do one thing that its will send the name variable 
		model.put("name",name);
		String s="Hey its me";
		model.put("String",s);
		return "hello";
	}
	
	/*@RequestMapping("/login/even")
	@ResponseBody
	public int even() {
		return 0;
	}
	*/

}
