public class Pattern17 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            char ch='A';
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print(ch);
                ch++;
            }
            char ch2='A';
            for(int j=i;j>0;j--){
                System.out.print((char)(ch2+j-1));
            }
            System.out.println();
        }
    }
}
