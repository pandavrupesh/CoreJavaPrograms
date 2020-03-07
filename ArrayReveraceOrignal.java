import java.util.*;
class ArrayReveraceOrignal{
	public static void main(String [] args){
      int [] a={1,2,3,4,5,6};
      System.out.println(Arrays.toString(a));
      Reverce(a);
       System.out.println("After "+Arrays.toString(a));
	}
	static void Reverce(int[] arr){
		for(int i=0,j=arr.length-1;i<j;i++,j--){
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
		}
		
	}
}