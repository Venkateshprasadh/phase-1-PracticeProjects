package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class DemoController {
@ResponseBody
	@RequestMapping("/")
	public String demo() {
		return "hello viewers";
	}
@ResponseBody
@RequestMapping("/admin")
public String admin() {
	return "welcome admin";
}

@ResponseBody
@RequestMapping("/user")
public String user() {
	return "welcome users";
}


}
