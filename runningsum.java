package ada;
import java.util.Scanner;

public class runningsum {

	public static void main(String[] args) {
		int n,p,i,j;j=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the no of elements u want in the array");
		n=scan.nextInt();
		int a[]=new int[n];
		

		System.out.print("Enter the "+n+ "elements of the array");
		for(p=0;p<n;p++)
		{ a[p]= scan.nextInt();
		
		

	}
		int RunningSum=0;
		int b[]= new int[n];
		for(i=0;i<n;i++)
				{RunningSum+=a[i];
				b[j]=RunningSum;
				j++;
				}
		System.out.print("The input array is : [");
		for(i=0;i<n-1;i++)
		{ 
			System.out.print(a[i]+",");
		

} System.out.print(a[i]+"]");

System.out.print("The running sum array is : [");
for(j=0;j<n-1;j++)
{ 
	System.out.print(b[j]+",");


} System.out.print(b[j]+"]");

}
}
