class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.10; 
    }

    public void generatePerformanceReport() {
        System.out.println("Performance report for " + name + " (" + jobTitle + "):");
        System.out.println("Salary: $" + salary);
        System.out.println("Address: " + address);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Bonus: $" + calculateBonus());
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, String address, double salary, String jobTitle, String department) {
        super(name, address, salary, jobTitle);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15; // Higher bonus for managers
    }

    @Override
    public void generatePerformanceReport() {
        super.generatePerformanceReport();
        System.out.println("Department: " + department);
        System.out.println("Management-level bonus: $" + calculateBonus());
    }

    public void manageProject() {
        System.out.println("Managing project for department: " + department);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.12; // Slightly higher bonus for developers
    }

    @Override
    public void generatePerformanceReport() {
        super.generatePerformanceReport();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Developer-level bonus: $" + calculateBonus());
    }

    public void developFeature() {
        System.out.println("Developing a new feature using " + programmingLanguage);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("John Doe", "123 Elm St", 50000, "Software Engineer");
        Manager m1 = new Manager("Jane Smith", "456 Oak St", 80000, "Project Manager", "IT");
        Developer d1 = new Developer("Alice Brown", "789 Pine St", 70000, "Software Developer", "Java");

        System.out.println("Employee 1 Details:");
        e1.generatePerformanceReport();

        System.out.println("\nManager 1 Details:");
        m1.generatePerformanceReport();
        m1.manageProject();

        System.out.println("\nDeveloper 1 Details:");
        d1.generatePerformanceReport();
        d1.developFeature();
    }
}
