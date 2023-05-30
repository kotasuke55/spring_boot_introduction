package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson")
public class LessonController {
	
	@GetMapping("/sample")
	//@ResponseBody
	public String sample(Model model) {
		String text = "Hello Spting Boot!!";
		model.addAttribute("message", text);
		return "index";
	}
	
	@GetMapping("/request_test")
	@ResponseBody
	public String getTest(@RequestParam("name") String name, @RequestParam("bloodType") String bloodType) {
		return "名前: " + name + "<br> 血液型: " + bloodType;
	}
}
