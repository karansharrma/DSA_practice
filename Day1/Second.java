

//You are given an integer n. Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes.

public class Second {

public static void main(String[] args) {
int num=23456789;
    int reversedNum=0;

while(num!=0){
    int lastDigit=num%10;
     reversedNum =reversedNum*10 + lastDigit;
    num=num/10;
}
System.out.print(reversedNum);   
}
}


