public class HelloWorldGender extends HelloWorld
{
	public boolean g;
	public HelloWorldGender(String s,boolean b)
	{
		super(s);
		this.g=b;
	}	
	public void print()
	{
		String gender="Miss";
		if(g==false)
		{
			gender="Mr";
		}	
		System.out.println("Hello "+gender+" "+nom+" !!!");
	}
}
