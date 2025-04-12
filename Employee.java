public class Employee {
    private static String companyName = "Capgemini";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    public Employee(String name, String designation, int id) {
        this.name = name;
        this.designation = designation;
        this.id = id;
        totalEmployees++;
    }

    public static void displayTotalEmp() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmpDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Kshitij", "Software Engineer", 101);
        Employee emp2 = new Employee("Manoj", "Data Scientist", 102);
        Employee emp3 = new Employee("Aman", "Product Manager", 103);

        emp1.displayEmpDetails();
        System.out.println();
        emp2.displayEmpDetails();
        System.out.println();
        emp3.displayEmpDetails();

        displayTotalEmp();
    }
}

