import java.util.*;

public class FIZZBUZZ{
    public static void main(String[] args)
    {
        try
        {
            int n;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value");
            n=sc.nextInt();
            for (int i=1; i<=n; i++)
            {
                if (i%15==0)
                System.out.println("FizzBuzz");

                else if (i%5==0)
                System.out.println("Buzz");

                else if (i%3==0)
                System.out.println("Fizz");

                else
                System.out.println(i);
            }
        }
        catch(Exception e)
        {
            System.out.println("Due to character exception");
        }
    }
}
