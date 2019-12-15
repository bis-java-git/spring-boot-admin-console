package com.bis.actuatorservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminClientController {

	private static final String template = "I am Hemant, what can I do for you %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/admin-client")
	@ResponseBody
	public Greeting echo(@RequestParam(name="name", required=false, defaultValue="Dontknow") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/")
	@ResponseBody
	public Greeting welcome() {
		return new Greeting(counter.incrementAndGet(), String.format(template, "Welcome to Hemant Spring Dashboard "));
	}

}
