
public class Pope {
	
	public boolean chairOfPeter;
	
	public static void main(String[]args)
	{
		Bishop x = new Bishop();
		x.announce();
		Pope y = new Pope();
	}
	public Pope()
	{
		System.out.println("I am the supreme pontiff");
		chairOfPeter = true;
		System.out.println(name());
	}
	public static void encyclical()
	{
		System.out.println("Fratelli Tutti");
	}
	public static String name()
	{
		return "Pope Francis";
	}
}
