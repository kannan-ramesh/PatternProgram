package Pattern;

import java.util.Scanner;

//input=5
//output *****
//		  ****
//		   ***
//		    **
//		     *
public class RightDownTriangle {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=input.nextInt();
		
		for(int i=0;i<n;i++) {
			//print space
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			//print star
			for(int k=n;k>i;k--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
