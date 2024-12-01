import java.util.LinkedList;

class Main{
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println("Original LinkedList: " + linkedList);

        linkedList.add(1, "X"); // Inserts "X" at position 1
        System.out.println("LinkedList after inserting 'X' at position 1: " + linkedList);
    }
}
