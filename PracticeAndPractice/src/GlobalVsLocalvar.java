
public class GlobalVsLocalvar {
 int c=7;//global variable
	public static void main(String[] args) {
		int a=4;//local variable
		int b=6;//local variable
		GlobalVsLocalvar obj = new GlobalVsLocalvar();
		System.out.println(a+b+ obj.c);
		//to access global variable we have to create object of it
		
		sub();

	}
	static void sub()
	{
		int d=9;//local variable for sub,we can't use this variable outside sub
		System.out.println(d-3);
	}
}
