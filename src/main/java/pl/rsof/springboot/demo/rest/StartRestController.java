/*
 *  Company: RS
 *  Project: springboot-demo
 *  Created: 27 sty 2022  22:07:02
 *  Author:  RS 		
 */
package pl.rsof.springboot.demo.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p><p>27 sty 2022</p>
 * @author RS
 *
 */
@RestController
public class StartRestController {
	
	
	@Value("${coach.name}")
	private String coachName;
	@Value("${team.name}")
	private String teamName;
	
	
	
	@GetMapping("/")
	public String showHello() {
		return "Hello World, first SpringBoot, current server time: "+LocalDateTime.now();
	}
	
	
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run hard 5k!";
	}
	
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach of " + teamName + " is " + coachName;  
	}
	
}
