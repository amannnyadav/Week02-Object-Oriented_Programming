public class Patient {
    private static String hospitalName = "SRM Hospital";
    private static int totalPatients = 0;

    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void TotalPatients() {
        System.out.println("\nTotal Patients Admitted: " + totalPatients);
    }

    public void display() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("Kshitij", 30, "Fever", 101);
        Patient patient2 = new Patient("Aman", 25, "Cold", 102);
        Patient patient3 = new Patient("Manoj", 45, "Cough", 103);
        Patient patient4 = new Patient("Rita", 60, "Asthma", 104);

        patient1.display();
        System.out.println();
        patient2.display();
        System.out.println();
        patient3.display();
        System.out.println();
        patient4.display();

        TotalPatients();
    }
}






