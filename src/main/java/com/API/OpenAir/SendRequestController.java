package com.API.OpenAir;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping; 

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SendRequestController {

	@PostMapping(value="/SendRequest",produces = { "application/xml" })
	public String login(@RequestBody String body) {
		 RestTemplate restTemplate = new RestTemplate();
		 HttpHeaders headers=new HttpHeaders();
		 headers.setContentType(MediaType.APPLICATION_XML);
		 HttpEntity<String> request = new HttpEntity<String>(body, headers);
		 ResponseEntity<String> response = restTemplate.postForEntity("https://cervello.app.openair.com/api.pl", request, String.class);
		 return response.getBody();
	}
}
