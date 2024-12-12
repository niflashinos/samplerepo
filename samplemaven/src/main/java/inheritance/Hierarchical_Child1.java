package inheritance;

public class Hierarchical_Child1 extends hierarchical_Parent {
	public void display1()
	{
		System.out.println("Child class 1");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hierarchical_Child1 obj1 = new Hierarchical_Child1();
		obj1.display();
		obj1.display1();
	}

}
