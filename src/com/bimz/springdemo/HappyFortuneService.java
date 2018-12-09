package com.bimz.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return " HappyFourtuneService: Today is your lucky day";
	}

}
