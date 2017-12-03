package io.bcscan.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin")
public class AdminController {
	@RequestMapping(value = "/hello")
	public String doLogin() {
		return "Hello";
	}
}
