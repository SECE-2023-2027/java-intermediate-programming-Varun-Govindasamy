import java.util.Scanner;

abstract class Appliance {
    protected String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        System.out.println("Appliance is now powered on.");
    }

    public abstract void makeWork();
}

class WashingMachine extends Appliance {
    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    public void makeWork() {
        System.out.println("Washing machine is washing clothes.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brand: ");
        String brand = sc.nextLine();

        Appliance app = new WashingMachine(brand);
        app.turnOn();
        app.makeWork();

        sc.close();
    }
}