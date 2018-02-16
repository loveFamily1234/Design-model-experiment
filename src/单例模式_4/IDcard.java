package 单例模式_4;

public class IDcard {
	private static IDcard idcard;
	private IDcard(){
		System.out.println("创办了一张身份证号为123456789的身份证！！！");
	}
	public static IDcard getIDcard(){
		if(idcard == null){
			idcard = new IDcard();
			return idcard;
		}else{
			System.out.println("还是使用123456789的身份证号创办身份证！！！");
			return idcard;
		}
	}
	public static void main(String[] args) {
		getIDcard();
		System.out.println("身份证不小心弄丢了！！！");
		System.out.println("补办一张吧！！！");
		getIDcard();
	}
}
