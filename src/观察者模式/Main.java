package 观察者模式;

public class Main {
	public static void main(String[] args) {
		Subject subject = new Cat();
		Observer observer1 = new Mouse();
		Observer observer2 = new Master();
		subject.attach(observer1);
		subject.attach(observer2);
		subject.Notify();
	}
}
