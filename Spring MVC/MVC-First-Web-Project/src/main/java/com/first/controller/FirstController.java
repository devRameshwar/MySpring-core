package com.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET,value = "/show")
	public String showName() {
		return "Rameshwar Singh";
	}
}
