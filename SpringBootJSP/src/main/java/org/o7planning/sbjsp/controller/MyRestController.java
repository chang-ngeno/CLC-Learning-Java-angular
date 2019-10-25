package org.o7planning.sbjsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.o7planning.sbjsp.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/", method = RequestMethod.GET)
public class MyRestController {
	private static List<Person> persons = new ArrayList<Person>();

	static {
		persons.add(new Person("Bill", "Gates"));
		persons.add(new Person("Steve", "Jobs"));
	}

	@GetMapping(path = "/hello", produces = "application/json")
	public String helloWorld() {
		return "hello world";
	}

	@GetMapping(path="/persons", produces = "application/json")
	public List<Person> getAllPersons() {
		return persons;

	}
}
