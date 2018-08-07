package com.xhe.springdemo;

import java.util.Random;

public class HapplyFortuneService implements FortuneService{

	private String[] fortunes = new String[] {
			"fortune1",
			"fortune2",
			"fortune3"
	};
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int rnd = new Random().nextInt(3);
		return fortunes[rnd];
	}

}
