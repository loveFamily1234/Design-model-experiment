package װ��ģʽ_9;

public class Plane extends Decorator {

	public Plane(Transformer tf) {
		super(tf);
	}
	public void operation(){
		super.operation();
		fly();
	}
	public void fly(){
		System.out.println("���ν��Ϊ�ɻ�״̬�������ܹ���½�����ƶ�֮�⣬������������з��裡����");
	}
	
}
