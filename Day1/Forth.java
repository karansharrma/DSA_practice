
// Given an integer N, print all the divisors of N in the ascending order.

import java.util.ArrayList;
import java.util.List;

public class Forth {
    public static void main(String[] args) {

		int n=20;
		List<Integer> divisors = new ArrayList<>();
		for (int i=1; i<n ; i++ ) {
			if (n%i==0) {
				divisors.add(i);
			}
		}
		System.out.println(divisors);
		for (int divisor : divisors) {
			System.out.print(divisor + " "); 
		}
	}

}
