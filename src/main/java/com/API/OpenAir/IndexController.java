package com.API.OpenAir;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@RequestMapping("/")
	public String getMessage() {
		return "Everything Works Fine";
	}

}
