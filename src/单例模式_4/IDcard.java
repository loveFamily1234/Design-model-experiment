package ����ģʽ_4;

public class IDcard {
	private static IDcard idcard;
	private IDcard(){
		System.out.println("������һ�����֤��Ϊ123456789�����֤������");
	}
	public static IDcard getIDcard(){
		if(idcard == null){
			idcard = new IDcard();
			return idcard;
		}else{
			System.out.println("����ʹ��123456789�����֤�Ŵ������֤������");
			return idcard;
		}
	}
	public static void main(String[] args) {
		getIDcard();
		System.out.println("���֤��С��Ū���ˣ�����");
		System.out.println("����һ�Űɣ�����");
		getIDcard();
	}
}
