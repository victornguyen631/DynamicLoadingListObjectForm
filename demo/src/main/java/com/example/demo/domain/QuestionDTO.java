package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDTO {
	private String quesId;
	private String question;
	private String answerA;
	private String answerB;
	private String answerC;
	private String answerD;
	private String userAnswer;
	
}
