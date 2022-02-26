package methodCreation;

public class Case1 {
	
	//method neither taking a parameter nor returning a value

	int x=10;
	int y=20;
	 void sum()  //method not returning value
	{
	     System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		
		Case1 obj=new Case1();
	obj.sum();    //method not taking parameter
	}

}
