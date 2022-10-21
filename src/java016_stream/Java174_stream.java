package java016_stream;

import java.io.File;
import java.io.IOException;

public class Java174_stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("src/java016_stream/test.txt");
		if(file.exists()) {
			
				file.delete(); //파일 삭제
				System.out.println("파일 삭제");
		
		}else {
			System.out.println("파일 없음");
		}

		
	} // end

} // end
