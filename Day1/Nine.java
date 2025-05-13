
// ArmStrong Number


public class Nine {
   public static void main(String[] args) {
        int n = 371;  
        int sum = 0, originalNumber = n;
        
        while (n > 0) {
            int digit = n % 10;  
            sum += digit * digit * digit;  
            n /= 10;  
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
   
