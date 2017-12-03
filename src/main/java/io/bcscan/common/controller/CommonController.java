package io.bcscan.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class CommonController {
	@RequestMapping(value = "/index")
	public String doLogin() {
		return "index";
	}
}
