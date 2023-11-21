package com.practise;

public class TryCatchBlock {
public static void main(String args[]) {
	try {
		int a=100/0;
	}

	catch(ArithmeticException  e){
		System.out.println(e);
	}
	System.out.print("last line of exception");
}
//public static void main(String[] args) {  
//    try  
//    {  
//    int data=50/0; //may throw exception   
//    }  
//        //handling the exception  
//    catch(ArithmeticException e)  
//    {  
//        System.out.println(e);  
//    }  
//    System.out.println("rest of the code");  
//}  
}
