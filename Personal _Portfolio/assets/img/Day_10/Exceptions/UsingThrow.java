package com.DAY10.ThrowKeyword;
import java.util.*;

public class UsingThrow {
	static int acceptNumber() {
		System.out.println("Enter your number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		return n;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int per;
		per=acceptNumber();
		try {
			if(per<0) {
				throw new negativeException();}
				else if(per>100) {
					throw new greaterValueException();}
					else System.out.println("Valid percentage");
			
			
		}
		catch(negativeException|greaterValueException e) {
			System.err.println("Error...."+e.getMessage());
		}

	}

}
