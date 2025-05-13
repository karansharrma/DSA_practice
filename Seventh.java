//Finding all the Prime Factor Of a Number

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Seventh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number N
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();

        // Set to store prime factors
        Set<Integer> primeFactors = new TreeSet<>();

        // Check for divisibility by 2
        while (N % 2 == 0) {
            primeFactors.add(2);
            N /= 2;
        }

        // Check for odd factors from 3 onwards
        for (int i = 3; i * i <= N; i += 2) {
            while (N % i == 0) {
                primeFactors.add(i);
                N /= i;
            }
        }

        // If N is still greater than 2, it is prime
        if (N > 2) {
            primeFactors.add(N);
        }

        // Print the result
        System.out.println("The unique prime factors are: " + primeFactors);
    }
}



