package com.example.demo.domain;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class TestInfo {
	private String genId;
	private List<QuestionDTO> quesions;
}
