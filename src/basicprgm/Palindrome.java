package basicprgm;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number to check : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0,temp;
        temp = num;
        while(num>0) {
            sum = sum * 10;
            sum = sum + num%10;
            num = num/10;
        }
        if (temp == sum) {
            System.out.println("The given number is Palindrome.");
        }else {
            System.out.println("The given number is not palindrome.");
        }
    }

}
