package basicprgm;
import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {

        System.out.println("Enter the first number to swap : ");
        Scanner input = new Scanner(System.in);
        int num_1 = input.nextInt();
        System.out.println("Enter the second number to swap : ");
        int num_2 = input.nextInt();
        int temp;
        System.out.println("Before swapping the number : The first number is : "
                + num_1 + " and the second number is : " + num_2);

        // Swapping two variables using third variable

/*		temp = num_1;
		num_1 = num_2;
		num_2 = temp;*/

        // Swapping two variables without using third variable

        num_1 = num_1 + num_2;
        num_2 = num_1 - num_2;
        num_1 = num_1 - num_2;

        System.out.println("After swapping the number : The first number is : "
                + num_1 + " and the second number is : " + num_2);
    }

}

