import java.util.*;

public class Employee_Tax{
    public static void main(String[] Args){
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter Income : ");
        int inc = sc.nextInt();
        float tax;

        if(inc> 0){
            if(inc<=150000){
                tax = 0;
            }
            else if(inc>150000 &&inc<=300000){
                tax =(float)(0.1*inc);
            }
            else if(inc>300000 &&inc<=500000){
                tax = (float)(0.2*inc);
            }
            else{
                tax = (float)(0.3*inc);
            }
            System.out.println("Tax : " + tax);
        }
        else{
            System.out.println("Enter a Valid Income");
        }



    }
}
