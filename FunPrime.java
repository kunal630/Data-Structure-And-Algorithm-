
public class FunPrime {
    public static void primeChecker(int n){
    boolean isPrime=true;
    if(n<=1){
        isPrime=false;
    }else{
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
    }
    if(isPrime){
        System.out.println("Number is Prime");
    }else{
        System.out.println("Number is Not Prime");
    }
    
}
    public static void main(String[] args) {

        primeChecker(5);
        
    }
}
