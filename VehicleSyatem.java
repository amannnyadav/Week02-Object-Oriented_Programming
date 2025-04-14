public class VehicleSyatem {
    public static void main(String[] args) {
        Vehicle car = new Car(200, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 10);
        Vehicle motorcycle = new MotorCycle(180, "Petrol", false);

        Vehicle[] vehicles = {car, truck, motorcycle};
        for(int i=0;i<vehicles.length;i++){
            vehicles[i].displayInfo();;
            System.out.println();
        }
    }
}

class Vehicle{
    double maxSpeed;
    String fuelType;
    public Vehicle(double maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }

    public void displayInfo(){
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle{
    int seatCapacity;
    public Car(double maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle{
    double capacity;
    public Truck(double maxSpeed,String fuelType,double capacity){
        super(maxSpeed, fuelType);
        this.capacity=capacity;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Load Capacity: " + capacity + " tons");
    }
}

class MotorCycle extends Vehicle{
    boolean hasSidecar;
    public MotorCycle(double maxSpeed,String fuelType,boolean hasSidecar){
        super(maxSpeed, fuelType);
        this.hasSidecar=hasSidecar;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
