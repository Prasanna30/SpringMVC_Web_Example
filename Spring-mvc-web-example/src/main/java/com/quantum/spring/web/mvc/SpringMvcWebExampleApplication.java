package com.quantum.spring.web.mvc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.quantum.spring.web.mvc.model.Album;

@SpringBootApplication
public class SpringMvcWebExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcWebExampleApplication.class, args);
	}

}

@Controller
class HelloController{
	
	@GetMapping("/time")
	public ModelAndView sayHello(Model model) {
		ModelAndView modelAndView = new ModelAndView("timeView");
		Album alb = new Album();
		alb.setName("Love today");
		alb.setArtist("A.R. Rehman");
		alb.setRating(8);
		alb.setYear("01/01/1998");
		modelAndView.addObject(alb);
		return modelAndView;
	}
}