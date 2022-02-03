package basicprgm;
import java.util.Scanner;
public class Reverse {

    public static void main(String[] args) {
        System.out.println("Enter the number to check : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0,temp;
        temp = num;

        while(num > 0) {
            sum = sum * 10;
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println("The reverse of " + temp + " is " + sum);

    }

}
