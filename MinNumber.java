

import java.util.Scanner;

public class MinNumber {
static int n;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of element");
		n=sc.nextInt();
		int []arr=new int[n];
		for (int i=0; i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int e= minElement( arr);
		System.out.println(e);
	}
 public static int  minElement(int arr []) {
	for(int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]>arr[j]) {
				int min =arr[i];
				arr[i]=arr[j];
				arr[j]=min;
			}
			
		}
	}
	 
	 return arr[0]; 
 }
}
