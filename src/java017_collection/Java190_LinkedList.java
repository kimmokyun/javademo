package java017_collection;

import java.util.LinkedList;

/*
 * stack(스택)
 * 1. LIFO(Last In First Out) : 마지막에 저장된 요소를 먼저 꺼낸다.
 * 2. 수직계산, 수식괄호검사 , undo/redo, 뒤로/앞으로
 */

public class Java190_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> nStack = new LinkedList<String>();

//append
nStack.push(new String("java"));
nStack.push(new String("jsp"));
nStack.push(new String("spring"));
	}

}
