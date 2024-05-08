package com.java8;

@FunctionalInterface

interface EvenOdd{
	
	public void run(int x);
}
public class EvenAndOdd {

	public static void main(String[] args) {
		EvenOdd e1 = (x)-> {
			
			if(x%2==0) {
				
				System.out.println("Even");
			}else {
				
				System.out.println("Odd");
			}
		};
        e1.run(5);
	}

}
