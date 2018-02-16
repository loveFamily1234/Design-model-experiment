package 抽象工厂模式;

public class HaierAC implements AirConditionerInterface {

	@Override
	public void createAirConditioner() {
		// TODO Auto-generated method stub
		System.out.println("生产海尔空调！");
	}

}
