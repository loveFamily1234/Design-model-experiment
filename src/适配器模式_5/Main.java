package ������ģʽ_5;

public class Main {

	public static void main(String[] args) {
		CatInterface cat = new Cat();
		DogInterface dog = new Dog();
		System.out.println("è�ļ��ܰ���");
		Adapter adapter = new Adapter(dog);
		cat.catchMouse();
		adapter.catchMouse();
		System.out.println("------------------------------------------------------------");
		System.out.println("���ļ��ܰ���");
		adapter = new Adapter(cat);
		dog.cry();
		adapter.cry();
	}
}
