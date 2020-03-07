import java.util.Arrays;
class ArrayReverceCopy{
	public static void main(String [] args){
		int [] a={1,2,3,4,5,6,7};
		System.out.println("Before"+Arrays.toString(a));
		int [] b = Reverce(a);
		System.out.println(Arrays.toString(b));
	}
	static int [] Reverce(int [] x){
		int [] y=new int [x.length];
		for(int i=0,j=x.length-1;j>=0;i++,j--) {
			y[i]=x[j];
		}
		return y;
	}
}