package com.revature.spring.rest.client;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.revature.spring.rest.controllers.Greeting;

public class RestTemplateClient {
public static void main(String[] args) {
	RestTemplate restTemplate =new RestTemplate();
	//ResponseEntity<Greeting> greet=restTemplate.getForEntity("http://localhost:8080/greeting", Greeting.class);
	//Greeting greet =restTemplate.getForObject("http://localhost:8080/greeting", Greeting.class);
	ResponseEntity<Greeting> greet=restTemplate.exchange("http://localhost:8080/greeting", HttpMethod.GET, null, Greeting.class);
	
	System.out.println(greet);
	

}
}
