package java016_stream;

import java.io.File;
import java.io.IOException;

public class Java172_stream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File file = new File("src/java016_stream/a/b");
File file = new File("src/java016_stream");
file.createTempFile("source", "texd");
if(file.isDirectory()) {
		//file.delete(); // 폴더삭제
		//file.deleteOnExit();
	System.out.println("폴더 삭제");	
}else {
	System.out.println("폴더 없음");
}
	}

}
