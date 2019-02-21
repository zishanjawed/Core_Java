package Java_by_Navin_reddy;

import java.util.Scanner;

public class StirngDemo1 {
	public static void main(String ...strings )
	{
		Scanner sc = new Scanner(System.in);
		String str1,str2,str3;
		System.out.println("Enter the two string ");
		str1 = sc.nextLine();
		str2 = sc.nextLine();
		str3 = str1.concat(str2);
		System.out.println("The String after Concatination is : "+str3);
		System.out.println("The lenght of first string is : "+(str1.length()));
		System.out.println("The lenght of Secound  string is : "+(str2.length()));
		System.out.println("The lenght of Tird(after concatination) string is : "+(str3.length()));
		
	}

}
