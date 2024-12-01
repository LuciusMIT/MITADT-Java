import java.util.Scanner;

public class Main{
    public static void main( String[] args){
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        
        int input = sc.nextInt();
        int cnt = 0;
        
        while(input != 0){
            cnt++;
            input = input / 10;
        }
           System.out.println(cnt);
    }
}
