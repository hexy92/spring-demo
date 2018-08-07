package com.xhe.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	
	public TrackCoach(FortuneService fortuneService) {
		// TODO Auto-generated constructor stub
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It:" + fortuneService.getFortune();
	}


	//init method
	public void initMethod(){
		System.out.println("TrackCoach: init");
	}

	//destroy method
	public void destroyMethod(){
		System.out.println("TrackCoach: destroy");
	}
	
	

}
