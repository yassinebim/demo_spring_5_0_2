package com.bimz.springdemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	private String emailAdress;
	private String team;

	
	public CricketCoach() {
		System.out.println("CricketCoach No arg constructor");
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach Setter fortuneService");
		this.fortuneService = fortuneService;
	}
	
	

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		System.out.println("CricketCoach Setter emailAdress");

		this.emailAdress = emailAdress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach Setter team");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "CricketCoach : daily workout" ;
	}

	@Override
	public String getDailyFortune() {
		return "CricketCoach : "+ fortuneService.getFortune();
	}

	@Override
	public String toString() {
		return "CricketCoach [fortuneService=" + fortuneService + ", emailAdress=" + emailAdress + ", team=" + team
				+ "]";
	}


	
}
 