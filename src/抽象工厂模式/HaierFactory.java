package 抽象工厂模式;

public class HaierFactory implements FactoryInterface {

	@Override
	public void concrete(int i) {
		// TODO Auto-generated method stub
		if(i == 1){
			new HaierTV().createTV();
		}
		if(i == 2){
			new HaierAC().createAirConditioner();
		}
	}

}
