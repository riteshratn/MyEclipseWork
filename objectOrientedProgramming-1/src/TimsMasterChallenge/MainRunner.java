package TimsMasterChallenge;

public class MainRunner {
	public static void main(String[] args) {
		Hamburger hamburger=new Hamburger("Basic","Sausage",2.56,"white");
		double price=hamburger.itemizeHamburger();
		hamburger.addHamburgeradditional1("Tomato", 0.27);
		hamburger.addHamburgeradditional2("Lettuce", 0.75);
		hamburger.addHamburgeradditional1("Cheese",1.12);
		price=hamburger.itemizeHamburger();
	}

}
