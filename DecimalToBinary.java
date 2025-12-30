public class DecimalToBinary {
    public static int decToBin(int decNum){
        int pow=1,ans=0;
        while(decNum>0){
            int rem=decNum%2;
            decNum=decNum/2;

            ans+=(rem*pow);
            pow=pow*10;
        }
        return ans;
    }
    public static void main(String[] args) {
        
        int answer=decToBin(50);
        System.out.println(answer);
    }
}
