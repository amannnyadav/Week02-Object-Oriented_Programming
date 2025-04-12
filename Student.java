public class Student {
    private static String universityName = "SRM Institute of Science and Technology";
    private static int totalStudents = 0;
    private final String rollNo;
    private String name;
    private String grade;

    public Student(String name, String rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
        totalStudents++;
 }

    public static void displayTotalStudents() {
        System.out.println("\nTotal Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Kshitij", "RA2111051010051", "O");
        Student s2 = new Student("Manoj", "RA2111051010040", "A+");
        Student s3 = new Student("Aman", "RA2111051010015", "A+");
        Student s4 = new Student("Rupan", "RA2111051010052", "O");
        Student s5 = new Student("Aakansha", "RA2111051010030", "A+");

        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();
        System.out.println();
        s3.displayStudentDetails();
        System.out.println();
        s4.displayStudentDetails();
        System.out.println();
        s5.displayStudentDetails();

        displayTotalStudents();
    }
}


