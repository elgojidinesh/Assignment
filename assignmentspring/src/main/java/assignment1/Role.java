package assignment1;

public class Role {

	private Role()
	{
		
	}
	public static  Role getObjV()
	{
		return new Role();
		
	}
	public void show()
	{
		System.out.println("Role Based object is created");
	}
}
