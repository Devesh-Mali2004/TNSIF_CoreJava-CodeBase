package com.DAY10.Thread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread c=new ChildThread(10,"VH24");
		ChildThread c1=new ChildThread(15,"PK05");
		c.start();
		c1.start();
		System.out.println("end of the program");
	}

}
