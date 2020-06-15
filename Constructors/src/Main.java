
public class Main {
	public static void main(String[] args) { 
		Shirt s=new Shirt();
		
		s.setColor("Black");
	     s.setSize("M");
		s.putOn();
		s.putOff();
		
System.out.println(s.color);
System.out.println(s.size);
	}
}
