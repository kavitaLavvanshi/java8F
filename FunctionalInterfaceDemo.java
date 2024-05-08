package com.java8;

@FunctionalInterface
interface work{
	void start(String msg); 
	default void done() {
		
		System.out.println("Hello");
	}	
	
	
}

public class FunctionalInterfaceDemo implements work {
	
	
	@Override
	public void start(String msg) {
		System.out.println(msg);
		
	}

	public static void main(String[] args) {
		FunctionalInterfaceDemo f1 = new FunctionalInterfaceDemo();
        f1.done();
        f1.start("Functional interface");
	}



}
