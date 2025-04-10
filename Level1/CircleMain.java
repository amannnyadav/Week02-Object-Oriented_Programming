import java.util.Scanner;
class AreaOfCircle {
    private double radius;
    //constructor
    public AreaOfCircle(double radius){
        this.radius=radius;
    }
    public void displayAreaOfCircle(){
        System.out.println("Area of circle whose radius is "+radius+" is: "+3.14*radius*radius);
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        double radius=sc.nextDouble();
        AreaOfCircle areaOfCircle=new AreaOfCircle(radius);
        areaOfCircle.displayAreaOfCircle();
        sc.close();
    }
}
