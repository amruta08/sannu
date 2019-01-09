package pack1;

public class operatorExample 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=5;
		int c=8;
	System.out.println(a<b&&a++<c);//in logical && it will first condition if it false it will not go to second condition
			System.out.println(a);
		System.out.println(a<b&a++<c);//in bitwise & either the first condition is false or true it will check for second condition
			System.out.println(a);
	}
}
