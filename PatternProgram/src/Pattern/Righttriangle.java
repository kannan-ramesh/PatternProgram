package Pattern;

import java.util.Scanner;

//input 5
//output   *
//		  **
//		 ***
//		****
//	   *****
public class Righttriangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("ENter size:");
		int n=input.nextInt();
		
		for(int i=0;i<n;i++) {
			//print space
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			//print *
			for(int k=0;k<i;k++) {
				System.out.print("*");
				
				
			}
			System.out.println();
		}
	}

}
