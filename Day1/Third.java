
// Given a natural number n. You have to find the number of digits in it and return it.
public class Third {
public static void main(String[] args) {
    int num=877552;
    int digits=0;
    while(num!=0){
        num=num/10;
        digits=digits+1;
    }
    System.out.println(digits);
}}
