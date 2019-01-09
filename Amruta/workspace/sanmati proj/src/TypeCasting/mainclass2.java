package TypeCasting;

public class mainclass2
{
	public static void main(String[] args)
	{
		ddemo2 d2=new ddemo2();
		ddemo1 d1=(ddemo1)d2;
		//ddemo1 d1=new ddemo1();
		d1.disp();
		ddemo2 d3=(ddemo2)d1;
		d3.disp();
		d3.view();
		
	}
}
