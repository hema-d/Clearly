package javaPackage;

import java.util.Scanner;

public class Factorialofnumber {

	public static void main(String[] args) {
		int random=1;
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter username");

		    int  userName = myObj.nextInt();  // Read user input
		    System.out.println("Username is: " + userName);
		    
		    for(int i=1;i<userName;i++) {
		    	
		    random=random*i;
		    System.out.println(random);
		    }

	}

}
