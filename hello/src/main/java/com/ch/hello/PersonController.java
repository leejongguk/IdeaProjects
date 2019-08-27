package com.ch.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

	@RequestMapping("/person")
	public String person(){
		return "person";
	}

	@RequestMapping("/addr")
//	public String addr(@RequestParam("name") String name, @RequestParam("addr") String addr, Model model){ // @RequestParam 생략 가능
	public String addr(String name, String addr, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("addr", addr);
		return "addr";
	}

	@RequestMapping("/addr2")
	public String addr2(Person p, Model model) {
		model.addAttribute("person", p);
		return "addr2";
	}
}