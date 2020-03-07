import java.util.Arrays;
class BubbleSort{
	public static void main(String[] args) {
		int [] a={1,5,3,4,9,15,10,6};
		Sort(a);
		System.out.println(Arrays.toString(a));
	}
	static void Sort(int [] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1; j<arr.length;j++){
				if(arr[i]>arr[j]){
					int t =arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}

	    }
    }
}