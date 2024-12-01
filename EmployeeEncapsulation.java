public class Employee {
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

    public int calculateBonus() {
        return (int) (salary * 0.1);
    }

    public String generatePerformanceReport() {
        return "Performance report for " + name + ": Good performance.";
    }
}

class Manager extends Employee {
    private int numberOfReports;

    public Manager(String name, String address, double salary, int numberOfReports) {
        super(name, address, salary, "Manager");
        this.numberOfReports = numberOfReports;
    }

    public int getNumberOfReports() {
        return numberOfReports;
    }

    public void setNumberOfReports(int numberOfReports) {
        this.numberOfReports = numberOfReports;
    }

    @Override
    public int calculateBonus() {
        return (int) (getSalary() * 0.15);
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance report for " + getName() + ": Excellent leadership skills.";
    }

    public void manageProjects() {
        System.out.println(getName() + " is managing projects.");
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, "Developer");
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public int calculateBonus() {
        return (int) (getSalary() * 0.12);
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance report for " + getName() + ": Strong coding skills in " + programmingLanguage + ".";
    }

    public void workOnProjects() {
        System.out.println(getName() + " is developing software in " + programmingLanguage + ".");
    }
}

class Programmer extends Employee {
    private String mainSkill;

    public Programmer(String name, String address, double salary, String mainSkill) {
        super(name, address, salary, "Programmer");
        this.mainSkill = mainSkill;
    }

    public String getMainSkill() {
        return mainSkill;
    }

    public void setMainSkill(String mainSkill) {
        this.mainSkill = mainSkill;
    }

    @Override
    public int calculateBonus() {
        return (int) (getSalary() * 0.1);
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance report for " + getName() + ": Good problem-solving skills in " + mainSkill + ".";
    }

    public void assistInProjects() {
        System.out.println(getName() + " is assisting with project tasks using their main skill in " + mainSkill + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", "123 Street, Dehradun", 80000, 5);
        Developer developer = new Developer("Bob", "456 Road, Dehradun", 70000, "Java");
        Programmer programmer = new Programmer("Charlie", "789 Avenue, Dehradun", 60000, "Problem-solving");

        System.out.println("Manager: " + manager.getName());
        System.out.println("Bonus: " + manager.calculateBonus());
        System.out.println(manager.generatePerformanceReport());
        manager.manageProjects();

        System.out.println("\nDeveloper: " + developer.getName());
        System.out.println("Bonus: " + developer.calculateBonus());
        System.out.println(developer.generatePerformanceReport());
        developer.workOnProjects();

        System.out.println("\nProgrammer: " + programmer.getName());
        System.out.println("Bonus: " + programmer.calculateBonus());
        System.out.println(programmer.generatePerformanceReport());
        programmer.assistInProjects();
    }
}
