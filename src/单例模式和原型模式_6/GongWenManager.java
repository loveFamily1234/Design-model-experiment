package ����ģʽ��ԭ��ģʽ_6;

import java.util.Hashtable;

public class GongWenManager {
	
	private static GongWenManager manager;
	private Hashtable<String, AbstractGongWen> hashTable = new Hashtable<>();//����new һ�£���Ȼ14�б���ָ�����
//	private HashMap<String, AbstractGongWen> hashTable;
	
	private GongWenManager(){
		AbstractGongWen a = new GongWenA();
		AbstractGongWen b = new GongWenB();
		hashTable.put("A", a);
		System.out.println("��A�๫��ģ������ϣ���У�����");
		hashTable.put("B", b);
		System.out.println("��B�๫��ģ������ϣ���У�����");
	}
	public static GongWenManager getManager(){
		if(manager == null){
			manager = new GongWenManager();
		}
		return manager;
	}
	public void add(String key, AbstractGongWen abstractGongWen){
		hashTable.put(key, abstractGongWen);
	}
	public AbstractGongWen get(String key){
		AbstractGongWen clone = null;
		clone = ((AbstractGongWen)hashTable.get(key)).clone();//ͨ����¡���������¶���
		return clone;
	}
}
