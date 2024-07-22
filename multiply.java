class multiply
{
	int i,j,k;
	double m,n,o;
	String x,y,z;
	public void add(int i,int j)
	{
		k=i+j;
		System.out.println("k="+k);
	}
	public void add(double m,double n)
	{
		o=n-m;
		System.out.println("o="+o);
	}
	public void add(String x,String y)
	{
		z=x+y;
		System.out.println("z="+z);
	}
	public static void main(String s[])
	{
		Exp1 e=new Exp1();
		e.add(1,62);
		e.add(1.5,1.9);
		e.add("fi","re");
	}
}