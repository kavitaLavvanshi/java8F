package com.java8;

interface Start{
	
	public void run();
}

public class UseLamdaExpression {

	public static void main(String[] args) {
		int w=28;
		Start d1 = ()-> {
			
			System.out.println("output " + ""+ w);
		};
        d1.run();
	}

}
