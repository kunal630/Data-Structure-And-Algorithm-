public class ReverseNum {

    public static void main(String[] args) {
        int revNum=0;
        int num = 125;
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            revNum += digit;
            if (num == 0) {
                break;
            } else {
                revNum = revNum * 10;
            }

        }
        System.out.println(revNum);

    }
}
