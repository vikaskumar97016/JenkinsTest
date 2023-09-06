package com.vikky.task.management;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Controller {

	
	@GetMapping("/greet-to/{name}")
	public Map<String, Object> greetTo(@PathVariable String name){
		
		System.out.println("name   :   "+name);
		Map<String, Object> map = new HashMap<>();
		map.put("message", "Hi "+name+"!  How are you ....");
		map.put("status", "success");
		map.put("statusCode", 200);
		
		return map;
	}
	
}
