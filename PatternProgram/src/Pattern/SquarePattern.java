package Pattern;

import java.util.Scanner;

//input =5
//output *****
	//   *   *
	//   *   *
//		 *   *
//		 *****
public class SquarePattern {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter size:");
		int n=input.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1) {
					System.out.print("*");
				}else if(j==0 || j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
