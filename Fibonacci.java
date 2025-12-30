import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Postion where you want a number in fibonacii series");
        int pos = sc.nextInt();
        if (pos <= 0) {
            System.out.println("Please enter a valid positin !!");
            return;
        } else if (pos == 1) {
            System.out.println("Your " + pos + " Term is " + 0);
            return;
        } else if (pos == 2) {
            System.out.println("Your " + pos + " Term is " + 1);
            return;

        }
    
        int firstterm = 0;
        int secondterm = 1;
        for (int i = 3; i <= pos; i++) {
            int thirdterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = thirdterm;

        }
        System.out.println("Your " + pos + " Term is " + secondterm);

    }
}
