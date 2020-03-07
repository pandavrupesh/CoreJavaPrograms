import java.util.Arrays;
class ArrayMaxMin{
	public static void main(String [] args){
		int []a ={5,1,5,3,4,5,8,9,15,43};
		int m = Max(a);
		System.out.println(m);
		int m1=Min(a);
		System.out.println(m1);
	}
	static int Max(int []arr){
		int m=0;
		for(int i=0; i<arr.length;i++){
			if(m<arr[i]){
				m=arr[i];
			}
		}
		return m;
	}

	static int Min(int []arr){
		int m1=arr[0];
		for(int i=0;i<arr.length;i++){
			if(m1>arr[i]){
				m1=arr[i];
			}
		}
		return m1;
	}
}