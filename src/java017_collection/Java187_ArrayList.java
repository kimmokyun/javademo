package java017_collection;

import java.util.Enumeration;
import java.util.Vector;

public class Java187_ArrayList {
//Enumeration은 Vector와 Hashtable에서만 제공되는 인터페이스이다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<Integer> v = new Vector<Integer>();
v.add(10);
v.add(29);
v.add(39);
System.out.println("===일반 for===");
for(int i=0; i<v.size(); i++)
	System.out.println(v.get(i));
		
	System.out.println("==Enumeration===");
	//열거형
	Enumeration<Integer> enu = v.elements();
	while(enu.hasMoreElements()) {
		System.out.println(enu.nextElement());
	}
	
	}

}
