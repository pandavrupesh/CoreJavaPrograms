class UserDefineArray{
	public static void main(String[] args) {
		UserDefineArray [] e =new UserDefineArray[4];
		UserDefineArray[0]=new UserDefineArray(1,"john",150000);
				UserDefineArray[1]=new UserDefineArray(2,"john1",250000);
		UserDefineArray Highestpaid = UserDefineArray getHighestpaid(e);
		System.out.println(Highestpaid);
	}
	static UserDefineArray getHighestpaid (UserDefineArray []arr){
		UserDefineArray Highestpaid =arr[0];
		for(int i=0; i<arr.length;i++){
			if(arr[i]>Highestpaid){
				Highestpaid=arr[i];
			}
		}
          return Highestpaid;
	}
	
}
class EmpArray{
	int empId;
	String name;
	float salary;
	EmpArray();
	EmpArray(int empId, String name, float salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	public String toString(){
		return "["+this.empId +","+this.name +","+ this.salary +"]";
	}
}