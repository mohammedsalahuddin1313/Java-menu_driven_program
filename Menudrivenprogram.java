import java.util.Scanner;

class Factorial
{
    int i,n,fact=1;

    void input()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=s1.nextInt();   
    }

    void calc()
    {
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The Factorial of "+n+" is "+fact);
    }
}

class OddEven
{
    int n;

    void input()
    {
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = s2.nextInt();
    }

    void calc()
    {
        if(n % 2 == 0)
        {
            System.out.println(n + " is even");
        }
        else
        {
            System.out.println(n + " is odd");
        }
    }
}

class Fibonacci
{
    int i=1, n, a=0, b=1,c;

    void input()
    {
        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n = s3.nextInt();
    }

    void calc()
    {
        System.out.println("Fibonacci Series of " + n + " terms is:");
        while (i <= n) 
        {
            System.out.print(a + ", ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
}
          
class Bigof2
{
    int n1, n2;
    void input()
    {
        Scanner s4 = new Scanner(System.in);
        System.out.println("Enter the numbers");
        n1 = s4.nextInt();
        n2 = s4.nextInt();
    }
    void calc()
    {
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);
        if(n1>n2)
        {
            System.out.println("Maximum = " + n1);
        }
        else
        {
            System.out.println("Maximum = " + n2);
        }
        
    }
    

}

class PrimeNumber
{
    int num;

    void input()
    {
        Scanner s5 = new Scanner(System.in);
        System.out.println("Enter a number");
        num = s5.nextInt();
    }
    void calc()
    {
        boolean flag = false;
        for (int i = 2; i <= num / 2; i++) 
        {
            if (num % i == 0) 
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}

public class MenuDrivenProgram 
{
    public static void main(String[] args) 
    {
        Scanner s0 = new Scanner(System.in);
        int choice=0;
        Factorial a = new Factorial();
        OddEven b = new OddEven();
        Fibonacci c = new Fibonacci();
        Bigof2 d = new Bigof2();
        PrimeNumber e = new PrimeNumber();
        while(choice!=6)
        {
            System.out.println("\n\tMenu:");
            System.out.println("1. Factorial\n2. OddEven\n3. Fibonacci\n4. Bigof2\n5. PrimeNumber\n6. Exit");  
            System.out.print("Enter your choice:");  
            choice = s0.nextInt();
            switch (choice)
            {
                case 1:
                    a.input();
                    a.calc();
                    break;
                case 2:
                    b.input();
                    b.calc();
                    break;    
                case 3:
                    c.input();
                    c.calc();
                    break;    
                case 4:
                    d.input();
                    d.calc();
                    break; 
                case 5:
                    e.input();
                    e.calc();
                    break;   
                case 6:
                    System.out.println("Exiting the program...!"); 
                    break;
                default:
                    System.out.println("Invalid choice.\nPlease choose a valid option.");
            }
	}
    }
}