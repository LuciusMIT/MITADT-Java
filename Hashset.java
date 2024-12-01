import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");

        System.out.println("Number of elements in the HashSet: " + hashSet.size());
    }
}
