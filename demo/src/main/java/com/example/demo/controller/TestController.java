package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.TestInfo;
import com.example.demo.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;

	@RequestMapping(value = "test")
	public String showTestScreen(Model model) {

		model.addAttribute("testInfo", testService.initData());

		return "test";
	}

	@RequestMapping(value = "endTest", method = RequestMethod.POST)
	public String endTest(@ModelAttribute TestInfo testInfo, Model model) {

		System.out.println("Submit 1: \n" + testInfo.toString());
		model.addAttribute("resultMessage", "You have corrected 2/2 questions. ");

		return "viewResult";
	}

	@RequestMapping(value = "submitTest", method = RequestMethod.POST)
	@ResponseBody
	public String submitTest(@ModelAttribute TestInfo testInfo) {

		System.out.println("Submit by Ajax form: \n" + testInfo.toString());

		return "You have corrected 2/2 questions.";
	}

}
