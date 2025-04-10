class Employee{
    private String name;
    private int id;
    private int salary;
    //constructor
    public Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void DisplayEmployeeDetails(){
        System.out.println("Employee name is:"+name);
        System.out.println("Employee id is:"+id);
        System.out.println("Employee salary is:"+salary);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1=new Employee("rajat", 1, 20000);
        employee1.DisplayEmployeeDetails();
    }
   
}

