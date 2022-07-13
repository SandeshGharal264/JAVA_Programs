import java.util.Scanner;
class FactorialEx
{
	 public static void main(String[] args) {

	 	FactorialEx f= new FactorialEx();
		Scanner sc =new Scanner(System.in);  
		int fact=1,number;  

 		System.out.println("Enter a number: ");    
  		number=sc.nextInt();

    	for(int i=1;i<=number;i++)
    	{ 
      	fact=fact*i;   
  		}  
 		System.out.println("Factorial of "+number+" is: "+fact);    

	}
}