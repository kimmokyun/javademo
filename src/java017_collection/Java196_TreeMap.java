package java017_collection;

import java.util.TreeMap;

/*
 * TreeMap
 * 1. Map 인터페이시를 구현한 클래스.
 * 2. 정령을 제공하는 클래스
 */


public class Java196_TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
tmap.put(10, "java");
tmap.put(20, "sping");
tmap.put(30, "ssssa");

for(Integer key : tmap.keySet())
	System.out.printf("%d:%s\n", key, tmap.get(key));
	}

}
