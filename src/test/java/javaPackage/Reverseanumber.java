package javaPackage;

import java.util.Scanner;

public class Reverseanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str2="";
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter username");

		    int  userName = myObj.nextInt();  // Read user input
		    System.out.println("Username is: " + userName);
		    
		    String s=String.valueOf(userName);
		    //1234
		    
		    for(int i=0;i<s.length();i++) {
		    	char str=s.charAt(s.length()-1);
		    	str2=str+str2;
		    	System.out.println(str2);
		    }
	}

}
