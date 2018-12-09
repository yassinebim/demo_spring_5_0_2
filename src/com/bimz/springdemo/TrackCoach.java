package com.bimz.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "TrackCoach :  Working out Advices";
	}

	@Override
	public String getDailyFortune() {
		return "TrackCoach : " + fortuneService.getFortune();
	}

}
