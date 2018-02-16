package 组合模式_8;

public class Main {
	public static void main(String[] args) {
		AbstractFruit apple1,apple2,apple3,apple4,apple5,apple6;
		AbstractFruit banana1,banana2,banana3;
		AbstractFruit pear1,pear2;
		Plate plate1,plate2,plate3;
		
		System.out.println("《情景：大号水果盘里面装着3个苹果，2个香蕉，1个梨，"
				+"1个中号水果盘；》\n《其中中号水果盘里面装着"
				+ "2个苹果，1个香蕉，1个小号水果盘；》\n《其中小号水果盘里面"
				+ "装着1个苹果，1个梨。》");
		apple1 = new Apple("苹果1");
		apple2 = new Apple("苹果2");
		apple3 = new Apple("苹果3");
		apple4 = new Apple("苹果4");
		apple5 = new Apple("苹果5");
		apple6 = new Apple("苹果6");
		banana1 = new Banana("香蕉1");
		banana2 = new Banana("香蕉2");
		banana3 = new Banana("香蕉3");
		pear1 = new Pear("梨1");
		pear2 = new Pear("梨2");
		plate1 = new Plate("小号水果盘");
		plate2 = new Plate("中号水果盘");
		plate3 = new Plate("大号水果盘");
		
		plate3.add(apple1);
		plate3.add(apple2);
		plate3.add(apple3);
		plate3.add(banana1);
		plate3.add(banana2);
		plate3.add(pear1);
		
		plate2.add(apple4);
		plate2.add(apple5);
		plate2.add(banana3);
		
		plate1.add(apple6);
		plate1.add(pear2);
		
		plate2.add(plate1);
		plate3.add(plate2);
		
		plate3.eat();
	}
}
