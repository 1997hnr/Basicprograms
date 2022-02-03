package basicprgm;
import java.util.Scanner;

public class FlloydsTriangles {
    public static void main(String[] args) {

        System.out.println("Enter the number of rows you want triangle upto : ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int num = 1;

        for(int i = 1; i <= x; i ++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

    }
}
