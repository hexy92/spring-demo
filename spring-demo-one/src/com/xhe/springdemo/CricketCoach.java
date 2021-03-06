package com.xhe.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	
	public CricketCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("CricketCoach: inside noarg constructor");
	}
	
	
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}



	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}



	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		this.team = team;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes";
	}

	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	

}
