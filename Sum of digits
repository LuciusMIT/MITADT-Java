import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
    System.out.println("enter any number between 1 to 1000");
    
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    
    if( input > 1000 || input < 1 ){
        System.out.println("enter any number between 1 to 1000");
        input = sc.nextInt();
    }
    int sum = 0;
    while( input != 0){
        int lastDigit = input % 10;
        sum += lastDigit;
        input = input / 10;
    }
    System.out.println(sum);
    }
}
