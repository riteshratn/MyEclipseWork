package com.inRKs;
//extends threads
//implements runnable

class Task1 extends Thread{
	public void run() {
		System.out.println("\n Task1 started");
		for (int i = 101; i <= 199; i++) 
			System.out.print(i + " ");
		
		
		System.out.println("\n Task1 done");
	}
}

  class Task2 implements Runnable{

	@Override
	public void run() {
		System.out.println("\n Task2 started");
		for (int i = 201; i <=299; i++) 
			System.out.print(i + " ");
		
		
		System.out.println("\n Task2 done");
		
	}
	  
  }

public class ThreadBasicsRunner {

	public static void main(String[] args) {

		// task1
		System.out.println("\n Task1 kicked off");
		Task1 task1=new Task1();
		task1.start();
		System.out.println("\n Task2 kicked off");
		
		// task2
		  Task2 task2=new Task2();
		  Thread task2Thread=new Thread(task2);
		  task2Thread.run();
		
		
		System.out.println("\n Task3 kicked off");
		
		// task3
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n Task3 done");
		
		System.out.println("\n Main done");

	}

}
