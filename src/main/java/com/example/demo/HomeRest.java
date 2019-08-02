package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRest {
	
	@GetMapping("/pade")
//	@ResponseBody
	public RestPojoKhojo homeibaba()
	{
		RestPojoKhojo restPojoKhojo = new RestPojoKhojo();
		
		return restPojoKhojo;
	}
}
