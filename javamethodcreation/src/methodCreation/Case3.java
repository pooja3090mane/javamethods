package methodCreation;
//method taking parameter but not returning a value
public class Case3 {
	
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) 
	{
		Case3 obj=new Case3();
		obj.sum(100,2000);    
		}

	
}
