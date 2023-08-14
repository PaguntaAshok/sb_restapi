package com.it.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController : if use @RestController annotation no need to use @ResponseBody annotation
@Controller
public class MsgController {

	public MsgController() {
		System.out.println("MsgController Constructor");
	}
	//http://localhost:8081/welcome
	@ResponseBody
	@GetMapping("/welcome")
	public String WelcomeController() {
		//String msg = "Welcome Controller";
		return "********Welcome Controller****";
	}
	
	//http://localhost:8081/RespBdy
	@GetMapping("/RespBdy")
	@ResponseBody
	public String WelcomeCtrlWithRest() {
		//String msg = "Welcome Controller";
		return "Welcome Controller with Response Body";
	}
	
	//http://localhost:8081/RespCtrl
	@GetMapping("/RespCtrl")
	public ResponseEntity<String> respController() {
		String msg = "Welcome Controller with ResponseBody";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
}
