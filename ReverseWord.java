

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String Str =sc.nextLine();
		String output ="";
		String[] arr= Str.split(" ");
		
		for(int i=arr.length-1; i>=0; i--){
			output+=arr[i]+" ";
		}
		System.out.println(output); 
	}

	
}
