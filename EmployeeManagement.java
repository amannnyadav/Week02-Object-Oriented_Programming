class Employee{
    String name;
    int id;
    double salary;
    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}
class Manager extends Employee{
    int teamSize;
    public Manager(String name,int id,double salary,int teamSize){
        super(name, id, salary);
        this.teamSize=teamSize;
    }

    @Override
    public void displayDetails(){
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary+" ,TeamSize: "+teamSize);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    public Developer(String name,int id,double salary,String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    public void displayDetails(){
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary+" ,Programming Language: "+programmingLanguage);
    }
}
class Intern extends Employee{
    int duration;
    public Intern(String name,int id,double salary,int duration){
        super(name, id, salary);
        this.duration=duration;
    }

    @Override
    public void displayDetails(){
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary+" ,Internship Duration:"+duration);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Manager manager = new Manager("Aman", 101, 80000, 5);
        Developer developer = new Developer("Manoj", 102, 60000, "Java");
        Intern intern = new Intern("Gaurav", 103, 20000, 6);

        Employee[] employees = {manager, developer, intern};
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }
    }
}

