package java022;

public class Book {
String title;
int price;
public Book(String title, int price) {
	
	this.title = title;
	this.price = price;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %d",title,price);
	}



}
