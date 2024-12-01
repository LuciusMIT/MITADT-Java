import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        input = input.replace(" ", "").toLowerCase();
        String revInput = new StringBuffer(input).reverse().toString();
        
        if (input.equals(revInput))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome.");
    }
}
