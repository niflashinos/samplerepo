package inheritance;

public class Multilevel_ChildC extends Multilevel_ParentB {

	public void display3()
	{
		System.out.println("This is the child class");
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multilevel_ChildC obj =new Multilevel_ChildC();
		obj.display();
		obj.display2();
		obj.display3();
	}

}
