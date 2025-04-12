public class Vehicle {
    private static double registrationFee = 1000.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegFee(double newFee) {
        registrationFee = newFee;
    }

    public void display() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Kshitij", "Car", "ABC123");
        Vehicle vehicle2 = new Vehicle("Manoj", "Motorbike", "XYZ456");
        Vehicle vehicle3 = new Vehicle("Aman", "Truck", "LMN789");

        vehicle1.display();
        System.out.println();
        vehicle2.display();
        System.out.println();
        vehicle3.display();

        updateRegFee(1500.0);

        System.out.println("\nAfter updating registration fee:\n");
        vehicle1.display();
        System.out.println();
        vehicle2.display();
        System.out.println();
        vehicle3.display();
    }
}


