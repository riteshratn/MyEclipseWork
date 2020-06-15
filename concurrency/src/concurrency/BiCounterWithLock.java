package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {

	private int i=0;
	private int j=0;
	
	Lock lockForI=new ReentrantLock();
	Lock lockForJ=new ReentrantLock();
	
	public void incrementI() {
		lockForI.lock();//get lock for i
		i++;
		lockForI.unlock();
		//release lock for i
		
		
	}
	public int getI() {
		return i;
	}
	 public void incrementJ() {
		lockForJ.lock();//get lock for j
		j++;
		lockForJ.unlock();
		//release lock for j
		
		
	}
	public int getJ() {
		return j;
	}
	
}
