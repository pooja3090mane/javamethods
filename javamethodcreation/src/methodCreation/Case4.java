package methodCreation;
//method taking parameter as well as returning a value

public class Case4 {
	int sum(int a,int b)
	{
		return(a+b);
	}

	public static void main(String[] args) {
	
		Case4 obj=new Case4();
		int res=obj.sum(100,2000);   
		System.out.println(res);
		
	}

}
