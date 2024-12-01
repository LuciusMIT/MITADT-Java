import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().trim();
        
        if (input.isEmpty()) 
            System.out.println("Number of words: 0");
        else {
            int wordCount = input.split(" ").length;
            System.out.println("Number of words: " + wordCount);
        }
    }
}
