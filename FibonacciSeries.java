package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
int a=0, b=1, c;
System.out.println("Fibonacci series");
for (int i = 0; i < 8; i++) {
		System.out.println(a);
		c=a+b;
		a=b;
	    b=c;
}

	}

}
