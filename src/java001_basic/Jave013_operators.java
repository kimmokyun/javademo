package java001_basic;

public class Jave013_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 5;
		int c = 7;
		// && 연산자의 좌변이 false이면 우변은 수행하지 않는다.
		boolean res = (++a > b) && (++b < c);
		System.out.printf("a=%d, b=%d, c=%d\n", a, b, c);

		int x = 4;
		int y = 8;
		int z = 10;
		res = (z > ++y) || (++x > y);
		System.out.printf("x=%d,y=%d,z=%d, res=%b\n", x, y, z,res);
		
		
		
		// 우선순위 : &&, ||
		int k=1;
		int m=2;
		int n=3;
		res = k==2 || ++m==2 && n==3;
		System.out.printf("k=%d,m=%d,n=%d,res=%b\n",n,k,m,n,res);
	}

}
