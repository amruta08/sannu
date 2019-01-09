package TypeCasting;

public class mainclass 
{

	public static void main(String[] args)
	{
		demo1 d1=new demo1();
		d1.disp();
		demo2 d2=new demo2();
		d2.disp();
		d2.view();
		demo1 d3=(demo1)d2;
		d3.disp();
	}

}
