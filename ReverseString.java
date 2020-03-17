
import java.util.Scanner;

public class ReverseString {
	/*public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String Str =sc.nextLine();
		String Reverse ="";
		for (int i=Str.length()-1; i>=0; i--) {
			Reverse= Reverse + Str.charAt(i);
		}
		System.out.print(Reverse);
		
	}*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		char [] arr =str.toCharArray();
		for(int i=0, j=arr.length-1; i<j; i++, j--) {
			char temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		for(int c=0 ;c<=arr.length-1;c++)
		System.out.print(arr[c]);
	}

}
