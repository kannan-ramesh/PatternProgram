package Pattern;

import java.util.Scanner;

public class AlphaPattern2 {
	//input=E
	//output E E E E E
	//		 D D D D
	//		 C C C
	//		 B B
	//		 A
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter letter:");
		char c=input.next().charAt(0);
		
		int row=c-'A';
		
		for(int i=row;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(65+i));
			}
			System.out.println();
		}

	}

}
