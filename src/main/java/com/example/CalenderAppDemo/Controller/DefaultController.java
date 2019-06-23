package com.example.CalenderAppDemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {
	
	@RequestMapping("/")
	public String firstPage() {
		return "Hello CalenderEvent application successfully deployed and started...";
	}
	

}
