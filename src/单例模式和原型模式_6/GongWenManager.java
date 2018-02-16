package 单例模式和原型模式_6;

import java.util.Hashtable;

public class GongWenManager {
	
	private static GongWenManager manager;
	private Hashtable<String, AbstractGongWen> hashTable = new Hashtable<>();//必须new 一下，不然14行报空指针错误
//	private HashMap<String, AbstractGongWen> hashTable;
	
	private GongWenManager(){
		AbstractGongWen a = new GongWenA();
		AbstractGongWen b = new GongWenB();
		hashTable.put("A", a);
		System.out.println("将A类公文模板加入哈希表中！！！");
		hashTable.put("B", b);
		System.out.println("将B类公文模板加入哈希表中！！！");
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
		clone = ((AbstractGongWen)hashTable.get(key)).clone();//通过克隆方法创建新对象
		return clone;
	}
}
