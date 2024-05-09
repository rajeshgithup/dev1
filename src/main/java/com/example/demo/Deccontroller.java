package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Deccontroller {
@GetMapping("/get")
public String get() {
	return "hi";
}
@GetMapping("/get1")
public String get1() {
	return "hi";
}
@GetMapping("/get2")
public String get2() {
	return "hi";
}
}
