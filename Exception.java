class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}

class Main {
    public static void main(String[] args) {
        int[] numbers = { -10, 0, 5, -20, 8 }; 

        try {
            for (int number : numbers) {
                if (number > 0) {
                    throw new PositiveNumberException("Positive number found: " + number);
                }
            }
            System.out.println("No positive numbers found in the array.");
        } catch (PositiveNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
