package java016_stream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public class Java170_stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("src/java016_stream/song.txt");
		RandomAccessFile raf = null;
		String stn = new String("\r\nMoron 5 - Daylight, sunday Morning\r\n");
		
		try {
			raf = new RandomAccessFile(file, "rw");
			System.out.println(raf.getFilePointer());
			
			//song.txt파일의 총 길이를 리턴한다.
			long size = raf.length();
			//파일의 끝으로 포인터를 이동한다.
			raf.seek(size);
			raf.writeUTF(stn);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				raf.close();
			}catch (IOException e) {
				e.printStackTrace();
				
			}
		}
			
		

	}

}
