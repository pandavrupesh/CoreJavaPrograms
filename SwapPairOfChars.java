

import java.util.Scanner;

public class SwapPairOfChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		char[]arr = str.toCharArray();
		for(int i=0 ,j=1; j<=arr.length; i+=2, j+=2) {
			char temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;6
		}
		for(int k=0; k<=arr.length-1;k++)
		System.out.print(arr[k]);
	}

}
