class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("--------------------------");
    }
}

public class StudentDetails{
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice", 101, 95.5),
            new Student("Bob", 102, 82.0),
            new Student("Charlie", 103, 74.5),
            new Student("David", 104, 63.0),
            new Student("Eve", 105, 45.0)
        };
        for(int i=0;i<students.length;i++){
            students[i].displayDetails();
        }
   
    }
}