package inheritance;

public class Hierarchical_Child2 extends hierarchical_Parent{
	public void display2()
	{
		
		System.out.println("Child class 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchical_Child2 obj2 = new Hierarchical_Child2();
		obj2.display();
		obj2.display2();

	}

}
