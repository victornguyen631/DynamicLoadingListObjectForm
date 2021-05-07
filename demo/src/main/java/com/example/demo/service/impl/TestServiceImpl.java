package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.QuestionDTO;
import com.example.demo.domain.TestInfo;
import com.example.demo.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Override
	public TestInfo initData() {
		TestInfo testInfo = new TestInfo();
		List<QuestionDTO> QuestionDTOs = new ArrayList<QuestionDTO>();
		
		// Create dummy data
		QuestionDTO QuestionDTO1 = new QuestionDTO("1", "Question 1 is?", "Son Tung", "MJ", "Noo", "Min", "");
		QuestionDTO QuestionDTO2 = new QuestionDTO("2", "Question 2 is?", "Son Tung", "MJ", "Noo", "Min", "");
		QuestionDTOs.add(QuestionDTO1);
		QuestionDTOs.add(QuestionDTO2);
		testInfo.setQuesions(QuestionDTOs);
		testInfo.setGenId("nhac dance");

		return testInfo;
	}

}
