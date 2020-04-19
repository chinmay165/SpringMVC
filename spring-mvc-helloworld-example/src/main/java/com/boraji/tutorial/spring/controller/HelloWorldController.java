package com.boraji.tutorial.spring.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import configure.TestClass;
import configure.UserDetails;
import configure.UserInfo;

/**
 * @author imssbora
 */
@Controller
@RequestMapping("/los")
public class HelloWorldController {
	//TestClass getinfo = new TestClass();
	@Autowired TestClass getinfo;
	@Autowired UserInfo uinfo;
	@Autowired UserDetails ud;
	
   
	
   @RequestMapping(path={"/"},method=RequestMethod.GET)
   public String sayHello(Model model) {
      model.addAttribute("message","MY first Spring MVC !");
      model.addAttribute("uname", uinfo.username());
     
      //Java 8 LocalDate
      DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
      LocalDate date=LocalDate.now();
      
      model.addAttribute("date", date.format(formatter));
      System.out.println();
      
      return "LOS/index";
   }
   
   @RequestMapping(path={"/user"},method=RequestMethod.GET)
   public String userDetails(Model model) {
      model.addAttribute("lebel","UserDetail");
      model.addAttribute("userdet", ud.getInfo());
      //model.addAttribute("userName", ud.getInfo().getName());
      //model.addAttribute("userEmpid", ud.getInfo().getEmpid());
      //model.addAttribute("userAddress", ud.getInfo().getAddress());
     
      
      
      return "LOS/userdetails";
   }
   
   @RequestMapping(path={"/save"},method=RequestMethod.POST)
   public String saveDetails(@ModelAttribute UserDetails getuserdet, Model model) {
	   System.out.println(getuserdet.getAddress());
	   System.out.println(getuserdet.getName());
	   System.out.println(getuserdet.getEmpid());
	   
	  // getuserdet.addAttribute("lebel","UserDetail");
	  // getuserdet.addAttribute("userdet", ud.getInfo());
      model.addAttribute("userName", getuserdet.getName());
      model.addAttribute("userEmpid", getuserdet.getEmpid());
      model.addAttribute("userAddress", getuserdet.getAddress());
     
      
      
      return "LOS/index";
   }
   
}
