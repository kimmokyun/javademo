package java016_stream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class phone {
	String name;
	int price;
	
	public phone() {
		
	}
public phone(String name, int price) {
	
		this.name = name;
		this.price = price;
	}
@Override
public String toString() {
	return String.format("%\s%d\n",name,price);
}

} //end ph

public class Java176_stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file = new File("src/java016_stream/phone.dat");
FileOutputStream fs = null;
ObjectOutputStream os = null;
FileInputStream fi = null;
ObjectInputStream oi = null;


try {
fs = new FileOutputStream(file);
os = new ObjectOutputStream(fs);

phone p = new phone("android",5000);
os.writeObject(p);
System.out.println("객체 저장");
}catch (FileNotFoundException e) {
	e.printStackTrace();
}catch (IOException e) {
	e.printStackTrace();
}finally {
	try {
		os.close();
		fs.close();
	}catch (IOException e) {
		
	}
}




















	} // end

} // end
