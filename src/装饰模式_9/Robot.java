package װ��ģʽ_9;

public class Robot extends Decorator {

	public Robot(Transformer tf) {
		super(tf);
	}
	public void operation(){
		super.operation();
		speak();
	}
	public void speak(){
		System.out.println("���ν��Ϊ������״̬�������ܹ���½�����ƶ�֮�⣬������˵��������");
	}
}
