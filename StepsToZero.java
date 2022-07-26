package Pc1;
import java.util.*;

public class StepsToZero {

	public static void main(String[] args) {
		System.out.println("This pgm returns number of steps it takes to redeuce an integer to 0. If the number is even, we divide by 2  else we subtract 1 froim it.");
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
n=s.nextInt();
ret c1=new ret(n);

	}

}
class ret{
	int n;
	 int count=0;
	 ret(int n)
	 {this.n=n;
	 while(n!=0)
	 {if(n%2==0)
	 { n=n/2; count++;
	 }
	 else
	 {n--;count++;
	 }
}System.out.println("No. of steps = "+ count);
	}
}