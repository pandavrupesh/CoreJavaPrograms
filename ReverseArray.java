

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter no. of element");
		n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		reverseArr(arr);
	}

	private static void reverseArr(int[] arr) {
		for(int i=0, j=arr.length-1; i<j; j--, i++) {
			
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			
		}
		for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k]);
		}
	}
}
