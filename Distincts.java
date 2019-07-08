import java.util.Scanner;

public class Distincts {
	 static int number1=256;
	 static int maxdistinct(String s,int n)
	 {
		 int count[]=new int[number1];
		 for(int i=0;i<n;i++)
		 {
			 count[s.charAt(i)]++;
		 }
		int max=0;
		for(int i=0;i<number1;i++)
		{
			if(count[i]!=0)
			{
				max++;
			}
		}
		return max;
	 }
	 static int small(String s)
	 {
		 int n=s.length();
		 int max=maxdistinct(s,n);
		 int min=n;
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 String sub=null;
				 if(i<j)
					 sub=s.substring(i,j);
				 else
					 sub=s.substring(j,i);
		         int sublength=sub.length();
		         int subs=maxdistinct(sub,sublength);
		         if(sublength<min &&subs==max){
		        	 min=sublength;
		         }
				 
			 }
		 }
		 return min;
	 }

	public static void main(String[] args) {
		
		  Scanner s=new Scanner(System.in);
		  String str=s.next();
		  int length=small(str);
		  System.out.println(length);
		  

	}

}
