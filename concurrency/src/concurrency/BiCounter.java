package concurrency;

public class BiCounter {

	private int i=0;
	private int j=0;
	synchronized public void incrementI() {
		i++;
		
		
	}
	public int getI() {
		return i;
	}
	synchronized public void incrementJ() {
		j++;
		
		
	}
	public int getJ() {
		return j;
	}
	
}
