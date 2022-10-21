package java016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class Java169_stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file = new File("src/java016_stream/score.txt");
		RandomAccessFile raf = null;
		
		try {
			//"r" : 읽기(read)만 가능하다.
			//"rw" : 읽기,쓰기가 가능하다.
			raf = new RandomAccessFile(file, "r");
			//현재 위치 리턴
			System.out.println(raf.getFilePointer());
			System.out.println((char)raf.read());
			System.out.println(raf.getFilePointer());
			System.out.println(raf.readLine());
			System.out.println(raf.getFilePointer());
			System.out.println(raf.readLine());
			System.out.println(raf.getFilePointer());
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
				
	}

}
