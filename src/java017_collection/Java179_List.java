package java017_collection;

public class Java179_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
UserList uList = new UserList();
uList.add(10);
uList.add(20);
uList.add(30);
uList.add(40);
System.out.println(uList.size());

Integer it1 = (Integer)uList.get(0);
System.out.println(it1.intValue());
System.out.println(uList.get(0));
System.out.println(uList.get(1));
System.out.println(uList.get(2));
System.out.println(uList.get(3));
System.out.println(uList.get(4));

	}

}
