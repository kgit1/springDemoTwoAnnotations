package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService2 implements FortuneService {

	@Override
	public String getFortune() {
		return "HappyFortuneService2 - Today is your lucky day!";
	}

}
