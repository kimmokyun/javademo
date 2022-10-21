package java016_stream;

import java.io.File;

public class Java175_stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file = new File("src/java016_stream/a");
deleteFileList(file);

	}

	public static void deleteFileList(File srcFile) {
		File[] fileAll = srcFile.listFiles();
		System.out.println(fileAll.length);
		if(fileAll != null) {
			System.out.println(fileAll.length);
		for(File file : fileAll) {
			System.out.println(file);
			deleteFileList(file);
		}
		}
	}
	
}
