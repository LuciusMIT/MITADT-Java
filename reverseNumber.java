import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        
        int input = sc.nextInt();
        int rev = 0;
        
        while( input != 0){
            int LastDigit = input % 10;
            rev = rev * 10;
            rev = rev + LastDigit;
            input = input / 10;
        }
           System.out.println(rev);
    }
}
