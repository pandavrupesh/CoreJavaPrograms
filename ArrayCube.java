import java.util.Arrays;
class ArrayCube{
	public static void main(String []args){
	int [] a= {1,2,3,4,5,6,8,7,9,10,2};
	int []b =Cube(a);
	System.out.println(Arrays.toString(b));
  }
  static int [] Cube(int []arr){
  	for(int i=0;i<arr.length; i++){
  		arr[i]=arr[i]*arr[i]*arr[i];
  	}
  	return arr;
  }
}