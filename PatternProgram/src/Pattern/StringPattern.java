package Pattern;

import java.util.Scanner;

public class StringPattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String:");
		String str=input.next();
		
		String newStr="";
		newStr+=str.charAt(0);
		
		for(int i=1;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))){
				str=str.substring(i);
				break;
			}
			newStr+=str.charAt(i);
		}
		
		pattern(newStr.toUpperCase(),str.toUpperCase());
	}

	private static void pattern(String left, String right) {
		int i=0;
		int j=0;
		String s1="";
		String s2="";
		while(i<left.length() && j<right.length()) {
			s1+=left.charAt(i);
			s2+=right.charAt(j);
			System.out.println(s1+""+s2);
			i++;
			j++;
		}
		while(i<left.length()) {
			s1+=left.charAt(i);
			System.out.println(s1+""+s2);
			i++;
		}
		while(j<right.length()) {
			s2+=right.charAt(j);
			System.out.println(s1+""+s2);
			j++;
		}
	}

}
