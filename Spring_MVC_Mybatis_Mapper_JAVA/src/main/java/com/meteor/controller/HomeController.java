package com.meteor.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.meteor.model.User;
import com.meteor.service.UserDAO;
import com.meteor.service.UserDAOex;
import com.meteor.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@Autowired
	UserService serv;
	
	@Autowired
	UserDAO userdao;
	
	@Autowired
	UserDAOex userda;
	//UserDAOex userda = new UserDAOex();
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		
		logger.info( serv.getUser("1").getName() );
				
		return "home";
	}
	/*
	/all
	/1
	/insert
	*/
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String select_user_all(Locale locale, Model model) {
		List<User> list_user = serv.getUser_All();
		
		for(int f1=1;f1<list_user.size();f1++){
			logger.info(list_user.get(f1).getName());
		}
				
		return "home";
	}
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert_user(Locale locale, Model model) {
		
		User user = new User();
		user.setAge(222);
		user.setName("22");		
		serv.insertUser(user);
		
		
		return "home";
	}
	
	@RequestMapping(value = "/dao{id}", method = RequestMethod.GET)
	public String dao_user(@PathVariable("id")String id ) {
		
		
		
		logger.info(userda.getUser(id).getName());
		//logger.info(userdao.getUser(id).getName());
		
		return "home";
	}
	
	
}
