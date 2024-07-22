class pgm2
{
	int i=10,j=20;
	int k;
	public void add()
	{
		k=i+j;
	}
	public void display()
	{
		System.out.println("k="+k);
	}
}
interface B
{
	int a=10,b=20;
	public void sub();
}
class C extends A implements B
