package com.java8;
@FunctionalInterface  
interface sayable{  
    void say(String msg);   // abstract method  
  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}  

public class FunctionalInterfaceEx2 implements sayable {
public void say(String msg){  
    System.out.println(msg);  
}  
public static void main(String[] args) {  
    FunctionalInterfaceEx2 fie = new FunctionalInterfaceEx2();  
    fie.say("Hello there");  
}  
}  