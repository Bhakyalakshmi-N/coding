package week1.day1;

public class MyJavaProgram {

	public static void main(String[] args) {
int num=15;
if(num %3 ==0 && num%5 ==0)
{
	System.out.println("divisible by both");
}
else if(num %3==0)		
{
System.out.println("Trizz");
	}
else if(num %5==0)
{
System.out.println("Fizz");	
}
else
{
System.out.println("neither divisible by 3 nor by 5");	
}
	}
}
