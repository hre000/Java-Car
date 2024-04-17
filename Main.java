public class Main {
    int meters;
    int percentage;

    public Main() {
        meters = 0;
        percentage = 100;
    }

    public void distanceDisplay() {
        // Displays the meters driven
        System.out.println("Current meters: " + meters);
    }

    public void batteryDisplay() {
        // Displays the battery percentage
        System.out.println("Current percentage: " + percentage);
    }

    public void drive() {
        if (percentage >= 1) {
            // If percentage is over or equal to one it will add meters and remove a percentage
            meters += 20;
            percentage -= 1;
        }

        else {
            //  If the battery is not over or equal to one it will say it is empty and not add meters or percentage
            System.out.println("Battery Empty");
        }
    }

    public static void main(String[] args) {
        Main car = new Main();
        car.drive();
        car.drive();
        car.drive();
        car.distanceDisplay();
        car.batteryDisplay();
    }
}
