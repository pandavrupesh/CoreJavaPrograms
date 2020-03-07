class FindMissinNo{
	public static void main(String[] args) {
		int [] a={0,1,2,3,5,6,7,8};
		int e= Find(a);
		System.out.println(e);
	}
	static int Find(int []arr){
		for(int i=0; i<arr.length; i++){
			boolean isFound =false;
			for(int e =0; e< arr.length; e++){
				if(arr[e]==i){
					isFound = true;
				}
			}
			if(!isFound){
				return i;
			}
		}
		return -1;
	}
}