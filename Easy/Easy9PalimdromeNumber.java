import java.util.Scanner;

public class Easy9PalimdromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean result = isPalindrome(x);
        System.out.println(result);
    }
    public static boolean isPalindrome(int x){
        int temp = x, sum =0, r;
        while(temp>0){
            r =temp%10;
            sum = (sum*10)+r;
            temp /=10;
        }
        if(sum == x){
            return true;
        }
        return false;
    }
}
