
public class ThisIsFun {

	int a;
	int b;

	public void setData(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {

		ThisIsFun t = new ThisIsFun();
		t.setData(4, 3);
		System.out.println(t.a);
		System.out.println(t.b);

	}

}
