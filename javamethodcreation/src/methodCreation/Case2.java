package methodCreation;

public class Case2 {
//method not taking parameter but returning a value
	int a=100;
	int b=20;
	int sum()
	{
		return (a+b);
		
	}
	public static void main(String[] args) {
		Case2 obj=new Case2();
		obj.sum();
//now we have to create some temporary variable to hold this returned value and mention the return type of result.
	//	int var=obj.sum();
		//now we want to capture the result
	//	System.out.println(var);
	//if we do not want to create temporary variable but want to capture the result then....
		System.out.println(obj.sum());
	}

}
