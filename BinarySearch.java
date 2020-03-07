import java.util.Scanner;
class BinarySearch{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int []a={1,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,93,97};
		int n=sc.nextInt();
		boolean Found =Search(a,n);
		if(Found){
			System.out.println("Found");
		}else{
			System.out.println("Not Found");
		}
    
    }
	static boolean Search(int [] arr,int no){
		int start=0;
		int end =arr.length-1;
		int mid=0;
		while(start<= end){
			mid=(start + end)/2;
			if(no==arr[mid])
				return true;
			if(no>arr[mid]){
				start=mid+1;
			}
			else{
				end=mid-1;
			}
		} 
		return false;
	}
}