package Pattern;

import java.util.Scanner;

//input=5
//output ABCDE
//	     ABCDE
//		 ABCDE
//		 ABCDE
//		 ABCDE
public class AlphaPattern {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int alpha=65;
		System.out.println("Enter size");
		int n=input.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print((char)(alpha+j));
				
			}
			System.out.println();
		}
	}

}
