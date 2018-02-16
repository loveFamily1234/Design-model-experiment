package 观察者模式;

public class Cat extends Subject {

	@Override
	public void Notify() {
		// TODO Auto-generated method stub
		System.out.println("猫大叫一声！！！");
		for(int i=0;i<observers.size();i++){
			((Observer)observers.get(i)).update();
		}
	}

	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

}
