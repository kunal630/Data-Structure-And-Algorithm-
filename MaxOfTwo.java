import java.util.Scanner;
public class MaxOfTwo{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int firstnum=sc.nextInt();

        System.out.println("Enter Second Number : ");
        int Secondnum=sc.nextInt();

        if (firstnum>Secondnum){
            System.out.println("First number is Greater !");
        }else if(firstnum==Secondnum){
            System.out.println("Both number are equal !");
        }else{
            System.out.println("Second number is greater");
        }
    }
}