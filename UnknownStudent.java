class Student {
    String name;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Student Name: " + name);
    }
}

class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Alice");
        Student student3 = new Student("Bob");

        student1.printName();
        student2.printName();
        student3.printName();
    }
}
