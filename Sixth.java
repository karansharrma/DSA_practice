// Given two positive integers a and b, find GCD of a and b.

public class Sixth {
    public static void main(String[] args) {
        int a = 10, b = 6;

        while (b != 0) {
            int temp = b;
            b = a % b;  
            a = temp;   
        }

        System.out.println("GCD of 10 and 6 is: " + a);
    }
}


//Inbuilt GCD FUNCTION
// public class Sixth {
//     public static void main(String[] args) {
//         int a = 10, b = 6;

//         // Using the inbuilt Math.gcd function to find GCD
//         int gcd = Math.gcd(a, b);

//         // Print the GCD
//         System.out.println("GCD of 10 and 6 is: " + gcd);
//     }
// }

