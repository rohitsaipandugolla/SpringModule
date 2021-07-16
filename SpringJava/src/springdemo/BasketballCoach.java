package springdemo;

public class BasketballCoach implements Coach{
    private FortuneService fortuneService;

    public BasketballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "practise batting";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
