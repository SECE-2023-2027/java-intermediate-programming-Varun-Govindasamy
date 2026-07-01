import java.util.Scanner;

class AreaCalculator {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculateArea(int side) {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius for circle: ");
        double radius = sc.nextDouble();

        System.out.print("Enter length and width for rectangle: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        System.out.print("Enter side for square: ");
        int side = sc.nextInt();

        System.out.println(AreaCalculator.calculateArea(radius));
        System.out.println(AreaCalculator.calculateArea(length, width));
        System.out.println(AreaCalculator.calculateArea(side));

        sc.close();
    }
}