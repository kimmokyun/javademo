package java017_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


/*
 * HashMap
 * 1. map인터페이스를 구현한 클래스이다.
 * Hashtable은 동기화 처리하고, Hashmap은 비동화 처리한다.
 * Hanshtable과 HashMap의 다른 기능들은 거의 같다.
 */

public class Java195_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, Number> map = new HashMap<Integer, Number>();
map.put(1, new Integer(10));
map.put(2, new Double(4.5));
map.put(3, new Float(2.3));

System.out.println((map.get(2)));

Set<Integer> set = map.keySet();
Iterator<Integer> lte = set.iterator();
while(lte.hasNext()) {
	Integer key = lte.next();
	System.out.printf("%d:%s\n", key,map.get(key));
}
	
	}

}
