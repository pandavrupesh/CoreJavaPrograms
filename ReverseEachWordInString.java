

import java.util.Scanner;

public class ReverseEachWordInString {
	
	static String reverse(String input) {
		char []arr =input.toCharArray();
		String output1="";
		for(int i=arr.length-1; i>=0;i--) {
			 output1 += arr[i];
		}
		return output1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Str =sc.nextLine();
		String output ="";
		String arr []=Str.split(" ");
		for(String w :arr) {
			output+=reverse(w)+" ";
		}
		System.out.print(output);
	}

}
