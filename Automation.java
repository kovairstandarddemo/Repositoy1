package com.sonar.io;

public class JavaProgram {
	public static void main(String args[]){
		int a[]={1,2,3,2,11,15,14,16};
		System.out.println("Odd Numbers:");
		for(int i=0;i<a.length;i++){
			if(a[i]%2!=0){
				System.out.println(a[i]);
			}
		}
		System.out.println("Even Number:");
	
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				System.out.println(a[i]);
			}
		}
		
		
		String input = "GeeksforGeeks"; 
		  
        // getBytes() method to convert string  
        // into bytes[]. 
        byte [] strAsByteArray = input.getBytes(); 
  
        byte [] result =  
                   new byte [strAsByteArray.length]; 
  
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i<strAsByteArray.length; i++) 
            result[i] =  
             strAsByteArray[strAsByteArray.length-i-1]; 
  
        System.out.println(new String(result)); 
        System.out.println(new String(result)); 
        // Requirement ID : 360
        
	}
	
}
