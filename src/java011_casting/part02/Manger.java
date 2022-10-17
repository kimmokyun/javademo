package java011_casting.part02;

public class Manger {
String name;
String dept;
String depth;

public Manger () {
	
}

public Manger(String name, String dept, String depth) {
	super();
	this.name = name;
	this.dept = dept;
	this.depth = depth;
}
@Override
public String toString() {
	return String.format("name:%s dept:%s depth:%s", name, dept, depth);
}


}
