public class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Course Name -> " + courseName);
        System.out.println("Duration -> " + duration + " weeks");
    }

    public static void main(String[] args) {
        PaidOnlineCourse p = new PaidOnlineCourse(
            "Java Programming",
            6,
            "Udemy",
            true,
            2999.0,
            20.0
        );
        p.displayInfo();
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform -> " + platform);
        System.out.println("Recorded -> " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Course Fee -> " + fee);
        System.out.println("Discount -> " + discount + "%");
        double finalPrice = fee - (fee * discount / 100);
        System.out.println("Final Price after Discount -> " + finalPrice);
    }
}
