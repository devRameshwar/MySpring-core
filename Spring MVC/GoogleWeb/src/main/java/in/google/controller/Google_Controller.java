package in.google.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Google_Controller {

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "/google")
	public static String showGoogle() {
		return " <h1>HELLO GOOGLE...........!<h1>";
	}
}
