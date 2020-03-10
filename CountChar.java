//import java.util.Scanner;
class CountChar{
	public static void main(String [] args){
		//Scanner sc =new Scanner(System.in);
		//String str=sc.next();
		String str ="macbook pro computer";
		System.out.println(str);
		int res=countChar(str,'o');
		System.out.println("Result = "+res);
	}
	static int countChar(String str, char ch){
		int cnt =0;
      for(int i=0; i<str.length();i++){
      	char c=str.charAt(i);
      	if(ch==c){
      		cnt++;
      	}
      }
      return cnt;

	}
}