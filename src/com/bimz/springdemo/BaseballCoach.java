package com.bimz.springdemo;

public class BaseballCoach implements Coach{

	private FortuneService fourtuneService;
	
	public BaseballCoach(FortuneService fourtuneService) {
		this.fourtuneService = fourtuneService;
	}


	public String getDailyWorkout() {
		return "BaseballCoach: train your stamina";
	}


	@Override
	public String getDailyFortune() {
		return "BaseballCoach : "+fourtuneService.getFortune();
	}
	
	public void doMyStartupStuff(){
		System.out.println("BaseballCoach: doMyStartupStuff()");
	}
	
	public void doMyShuttingDownStuff(){
		System.out.println("BaseballCoach: doMyShuttingDownStuff()");
	}
}
