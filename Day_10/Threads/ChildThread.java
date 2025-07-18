package com.DAY10.Thread;

public class ChildThread extends Thread{
	int n;
	String msg;
	
	public ChildThread(int n, String msg) {
		
		this.n = n;
		this.msg = msg;
	}
	//overriding run method from thread class which is parent class
	public void run() {
		for(int i=0;i<n;i++) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
				
			}
			System.out.println(i+msg);
		}
	}
	

}
