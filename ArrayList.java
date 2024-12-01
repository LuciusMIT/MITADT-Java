import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        System.out.println("Original List: " + list);

        if (list.size() >= 3) {
            list.remove(2); // Removes the third element (index 2)
            System.out.println("List after removing the third element: " + list);
        } else {
            System.out.println("The list has fewer than 3 elements.");
        }
    }
}
