package java013_api;

public class Java130_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb = new StringBuffer("java test");

sb.insert(4, "jsp"); // 인덱스 4까지 "jap"문자열을 삼입 java,jsp test
System.out.println(sb);

sb.delete(4, 8);  //java test // 4인덱스부터 8인덱스미만 사이의 문자열을 삭제

sb.append(" start"); // 마지막에 문자열을 추가
System.out.println(sb);

sb.reverse(); //문자열을 반대로 변경
System.out.println(sb); // trats tsetavaj


// String - > StringBuffer -> String
String data = "mybatis orm";
StringBuffer sf = new StringBuffer(data);
sf.reverse();
System.out.println(sf);
System.out.println(data);
String re = sf.toString();
System.out.println(re);


//char[] - > String -> StringBuffer
char [] arr = {'k','o','r','e','a'};
String sp = String.valueOf(arr);
StringBuffer se = new StringBuffer(sp);
se.reverse();
System.out.println(se);

System.out.println(new StringBuffer(String.valueOf(arr)).reverse());

//StringBuffer - > String - > char[]
String st = se.toString();
char[] val = st.toCharArray();
System.out.println(val);

System.out.println(se.toString().toCharArray());



























	} // end

} // end
