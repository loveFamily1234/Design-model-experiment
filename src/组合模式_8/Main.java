package ���ģʽ_8;

public class Main {
	public static void main(String[] args) {
		AbstractFruit apple1,apple2,apple3,apple4,apple5,apple6;
		AbstractFruit banana1,banana2,banana3;
		AbstractFruit pear1,pear2;
		Plate plate1,plate2,plate3;
		
		System.out.println("���龰�����ˮ��������װ��3��ƻ����2���㽶��1���棬"
				+"1���к�ˮ���̣���\n�������к�ˮ��������װ��"
				+ "2��ƻ����1���㽶��1��С��ˮ���̣���\n������С��ˮ��������"
				+ "װ��1��ƻ����1���档��");
		apple1 = new Apple("ƻ��1");
		apple2 = new Apple("ƻ��2");
		apple3 = new Apple("ƻ��3");
		apple4 = new Apple("ƻ��4");
		apple5 = new Apple("ƻ��5");
		apple6 = new Apple("ƻ��6");
		banana1 = new Banana("�㽶1");
		banana2 = new Banana("�㽶2");
		banana3 = new Banana("�㽶3");
		pear1 = new Pear("��1");
		pear2 = new Pear("��2");
		plate1 = new Plate("С��ˮ����");
		plate2 = new Plate("�к�ˮ����");
		plate3 = new Plate("���ˮ����");
		
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
