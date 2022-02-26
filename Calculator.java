import java.util.Scanner;
 class Calculator
 {

    float n3;
    static int ch;
   static float n1, n2;
    
    public static void main(String[] args) {

    Calculator cal= new Calculator();
    Scanner sc = new Scanner(System.in);

    System.out.println("\n******************** Calculator ********************\n");

    System.out.println("Enter first value: ");
      n1=sc.nextFloat();

    System.out.println("Enter second  value: ");
      n2=sc.nextFloat();
      // System.out.println("\n");
    System.out.println(" \n 1. Addition \n 2. Subtraction \n 3.Multiplication \n 4.Division ");
    System.out.println("Chooce any option: ");
      ch=sc.nextInt();
     if (ch==1) {
       cal.Addition();
     }
     else if(ch==2)
     {
        cal.Subtraction();
     }

     else if(ch==3)
     {
        cal.Multiplication();
     }
     else if(ch==4)
     {
        cal.Division();
     }
     else
     {
        System.out.println("CHooce correct operator");
     }

    }

    void Addition()
    {
        n3=n1+n2;
        System.out.println("Addition is : "+n3);
    }

    void Subtraction()
    {
        n3=n1-n2;
        System.out.println("Subtraction is : "+n3);
    }
    void Multiplication()
    {
        n3=n1*n2;
        System.out.println("Multiplication is : "+n3);
    }
    void Division()
    {
        n3=n1/n2;
        System.out.println("Division is : "+n3);
    }
 }