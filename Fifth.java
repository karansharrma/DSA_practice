// public class Fifth {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int n = 10;
//         int primeCount = sol.countPrimes(n);
//         System.out.println("Number of prime numbers less than " + n + " is: " + primeCount);
//     }
// }

// class Solution {
//     public int countPrimes(int n) {
//         int count = 0;
//         for (int i = 2; i < n; i++) {
//             if (isPrime(i)) {
//                 count++;
//             }
//         }
//         return count;
//     }

//     private boolean isPrime(int num) {
//         if (num <= 1) return false;
//         for (int i = 2; i * i <= num; i++) {
//             if (num % i == 0) return false;
//         }
//         return true;
//     }
// }



// OTHER METHOD
public class Fifth {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;

        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }

        System.out.println("Number of prime numbers less than " + n + " is: " + count);
    }
}
