package aceesmodifiers;

public class AccessmodifierExample1 {
	public void displa1()
	{
		System.out.println("Public");
		
	}
	private void display2()
	{
		System.out.println("Private");
		
	}
	protected void display3()
	{
		System.out.println("Protected");
		
	}
	void display4()
	{
		System.out.println("Default");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessmodifierExample1 obj = new AccessmodifierExample1();
		obj.displa1();
		obj.display2();
		obj.display3();
		obj.display4();
	}

}
