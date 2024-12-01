import java.util.Scanner;

public class Main{
    public static void main( String[] args){
    System.out.println("Enter any Number");
    Scanner sc = new Scanner(System.in);
    
    int input = sc.nextInt();
    int largestNum = 0;
    
    while( input != 0){
        int lastDig = input % 10;
        if( lastDig > largestNum ){
            largestNum = lastDig;
        }
        input = input / 10;
    }
    System.out.println(largestNum);
    }
}
