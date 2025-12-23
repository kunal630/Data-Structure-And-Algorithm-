import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter Principle Amount : ");
        double pri =sc.nextDouble();

        System.out.println(" Enter Rate of interest (%) : ");
        double rate=sc.nextDouble();

        System.out.println("Enter Time Duration in year : ");
        int year =sc.nextInt();

        double interest=(pri*rate*year)/100;

        System.out.println(" Simple Interest is : "+ interest);

    }
}