public class Pattern15 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print(k+1);
            }
           
            for(int v=i;v>0;v--){
                System.out.print(v);
            }
             System.out.println();
        }
    }
}
