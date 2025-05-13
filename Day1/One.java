
//Given a two-digit number n, print both the digits of the number.


import java.util.*;

public class One{
       public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int firstDigit=n/10;
        int lastDigit=n%10;


        System.out.println("First digit is "+ firstDigit + " Second digit is "+ lastDigit);
    }
}