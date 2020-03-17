
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String Str =sc.nextLine();
		String Reverse ="";
		for(int i=Str.length()-1; i>=0; i--) {
			Reverse =Reverse+Str.charAt(i);
		}
		if(Reverse.equals(Str))
			System.out.print("String is Palindrome");
		else 
			System.out.print("Not Palindrome");
	}

}
