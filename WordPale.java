

import java.util.Scanner;

public class WordPale {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s1=sc.nextLine();
		String ar[]=s1.split(" ");
		String ar2[]=new String [ar.length];
		for(int i=0;i<ar.length;i++)
		{
		StringBuffer sb=new StringBuffer(ar[i]);
		sb.reverse();
		ar2[i]=sb.toString();
		}
		for (int i=0;i<ar2.length;i++)
	   System.out.println(ar2[i]+" ");
		System.out.println();
		int count=0;
		for (int i=0; i<ar.length;i++)
		{
			if(ar[i].equals(ar2[i]) && ar[i].length()>1 && ar2[i].length()>1)
			{
				System.out.println(ar2[i]);
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("No Panlindrome");
		}
	}
}
