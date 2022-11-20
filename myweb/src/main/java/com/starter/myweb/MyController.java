package com.starter.myweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String home() {
		return "index";			// 해당 html파일을 열어줌
	}
	
	@getMapping("/keyboard")
	public String keyboardPage(Model model) {
		return "keyboard";
	}
	
	// [HTML <-> JAVA] 1.JSP 2.thymeleaf
	@getMapping("/result")
	public Stirng resultPage(Model model,@
		if(name.equlsIgnoreCase("1234")) {
			model.
		}
			model.
			
}
