package com.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Web {

	@GetMapping(value = "/aim")
	public String name() {
		return "Writer";
	}

	@GetMapping(value = "/black")
	public String ship() {
		return "Black Pearl";
	}

	@GetMapping(value = "/one")
	public String anime() {
		return "One Piece";
	}

}
