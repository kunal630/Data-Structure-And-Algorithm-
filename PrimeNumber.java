import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter a number : ");
        int num =sc.nextInt();
        boolean isPrime=true;
        if(num<=1){
            System.out.println("Number is not Prime");
        }
        else{

            for(int i=2;i*i<=num;i++){
            if(num%i==0){
               isPrime=false;
               break;
            }
        }

        }

        if(isPrime){
            
            System.out.println("Number is Prime ");

        }else{

             System.out.println("Number is not Prime");

        }
            
    }
}
