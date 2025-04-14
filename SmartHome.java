public class SmartHome {
    public static void main(String[] args) {
        Device device1 = new Device("D001", "Online");
        Thermostat thermostat1 = new Thermostat("T001", "Online", 22);
        device1.displaySetting();
        System.out.println();
        thermostat1.displaySetting();
    }
}

class Device{
    String deviceId;
    String status;
    public Device(String deviceId,String status){
        this.deviceId=deviceId;
        this.status=status;
    }
    public void displaySetting(){
        System.out.println("Device Id is: "+deviceId+" and Status is "+status);
    }
}

class Thermostat extends Device{
    int temperatureSetting;
    public Thermostat(String deviceId,String status,int temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting=temperatureSetting;
    }

    @Override
    public void displaySetting(){
        super.displaySetting();
        System.out.println("Temperature setting is: "+temperatureSetting);
    }
}