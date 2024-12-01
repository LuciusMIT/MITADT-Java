import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = "";
        for (char c : input.toCharArray()) {
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }
        
        System.out.println("String after removing duplicates: " + result);
    }
}

