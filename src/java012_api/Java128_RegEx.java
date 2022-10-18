package java012_api;

import java.util.regex.Pattern;

public class Java128_RegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("ymy232");
display(process("ymy232"));

System.out.print("korea");
display(process("korea"));


	} //end
public static boolean process(String sn) {
	
//	return (sn.matches(".*[a-zA-Z || $]"));
	return sn.matches("[a-zA-Z][a-zA-Z0-9]{4,9}") && Pattern.compile("\\d").matcher(sn).find();
}
public static void display(boolean res) {
	if (res) {
		System.out.println("로그인");
	}else {
		System.out.println("회원아님.");
	}
}

	
} // end
