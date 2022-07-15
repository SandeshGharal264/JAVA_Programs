import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[] args)
	{

		new Fibonacci();
		Scanner sc =new Scanner(System.in);  

		int i, num, t1=0, t2=1;

		int nextterm=t1+t2;

		System.out.println("Enter the number of terms: ");
		num=sc.nextInt();

		if (num == 1) {
			System.out.println("Fibonacci series: "+t1);
		}
		else 
			System.out.println("Fibonacci series: \n "+t1+" \n "+t2);
		
		for (i=3;i<=num ; ++i) {
			System.out.println(" "+nextterm);
			t1=t2;
			t2=nextterm;
			nextterm=t1+t2;
		}

	}
}