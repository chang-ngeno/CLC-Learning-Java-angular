package org.o7planning.sbjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping(path="/")
	public String index() {
		
		return "index";
	}
}
