public class BinaryTODecimal {
    public static int binToDec(int binNum){
        int ans=0;
        int pow=1;
        while (binNum>0) {

            int rem=binNum%10;
            ans+=(rem*pow);

            binNum/=10;
            pow*=2;
            
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(binToDec(110010));
    }
}
