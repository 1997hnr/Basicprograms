package basicprgm;

public class Rescursion_2 {

    int num = 5;

    public void recursion() {

        while (num >= 1) {

            System.out.println("Hi, I am recursion calling itself.");
            num--;
            recursion();
        }
    }

    public static void main(String[] args) {

        Rescursion_2 obj = new Rescursion_2();
        obj.recursion();

    }

}


