package exercise3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        do {
            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();
            if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
                double p = (a + b + c) / 2.0;
                double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Area: " + area);
                if (a == b && b == c) {
                    System.out.println("Triangle: equilateral");
                } else if (a == b || b == c || c == a) {
                    System.out.println("Triangle: isosceles");
                } else {
                    System.out.println("Triangle: scalene");
                }
            }
        } while (a > 0 && b > 0 && c > 0);
    }
}
