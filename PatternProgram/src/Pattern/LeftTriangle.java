package Pattern;

import java.util.Scanner;

//input=5
//output
//*
//**
//***
//****
//*****
public class LeftTriangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter number");
		int n=input.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}