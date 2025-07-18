package com.DAY10.Thread;

public class ThreadMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread t=new ChildThread(10,"Vriti");
		ChildThread t2=new ChildThread(15,"vvvriti");
		t.start();
		t2.start();
		Thread.currentThread().setName("Parent thread");
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println("current thread:"+Thread.currentThread());
		try {
			t.join();  //
			t2.join();
		}
		catch(Exception e) {
			Thread.currentThread().interrupt();
			System.err.println("Thread interrupted..."+e.getMessage());
		}
		System.out.println("END!!!!!!");
	}

}
