package solutions;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt(); sc.nextLine();
		int[] codesArray = new int[n];
		//Feeding input into codesArray
		for(int i=0 ; i<n ; i++) {
			codesArray[i] = sc.nextInt(); sc.nextLine();
		}
		//Iterating through codesArray to check for given conditions
		for(int i=0 ; i<n ; i++) {
			if(codesArray[i] % 21 == 0 ) {
				System.out.println("I will not go there!");
				continue ;
			}
			String codeString = Integer.toString(codesArray[i]);
			if(codeString.contains("21")) 
				System.out.println("I will not go there!");
			else 
				System.out.println("I will go there!");
		}
		sc.close();
	}

}
