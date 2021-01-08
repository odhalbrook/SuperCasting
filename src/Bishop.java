
public class Bishop extends Pope {

	
	public Bishop()
	{
		System.out.println("I am a sucessor to the apostles");
		chairOfPeter = false;
		
	}
	
	
	public static String name()
	{
		return "Archbishop Aquila";
	}
	public void announce()
	{
		System.out.println(super.name()+ " is supreme to me");
	}
}
