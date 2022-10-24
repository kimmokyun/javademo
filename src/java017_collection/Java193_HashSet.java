package java017_collection;

import java.util.HashSet;

public class Java193_HashSet {
//Hashset : 중복허용안되고 순서유지하는거
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashSet<Integer> set = new HashSet<Integer>();
	set.add(new Integer(10));
	set.add(new Integer(30));
	set.add(new Integer(10));
	set.add(new Integer(10));
	
	for(Integer it : set)
		System.out.println(it);
	
	}

}
