package com.oreilly;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
public class ThymeleafController extends WebMvcConfigurerAdapter {

	@RequestMapping("/thymeleaf")
	public String thymeleaf(){

		return "thymeleaf";
	}
}
