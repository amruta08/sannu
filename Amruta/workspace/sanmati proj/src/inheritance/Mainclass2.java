package inheritance;

public class Mainclass2 {

	public static void main(String[] args)
	{
		MultilevelDemo1 d1= new MultilevelDemo1();
		System.out.println("the ith value in Demo1 "+d1.i);
		d1.i=50;
		d1.disp();
		System.out.println("the modified value of the i "+d1.i);
		MultilevelDemo2 d2=new MultilevelDemo2();
		System.out.println("the value of j "+d2.j);
		d2.j=90;
		d2.i=80;
		System.out.println("the value of i and j "+d2.i+" "+d2.j);
		System.out.println(" i value in demo1 "+d1.i);
		d2.show();
		MultilevelDemo3 d4 = new MultilevelDemo3();
		d4.i=100;
		System.out.println("the value of i,j and k "+d4.i+" "+d4.j+" "+d4.k);
		System.out.println("the i value in demo1 "+d1.i); 
		
	}

}
