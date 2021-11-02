package exercise3;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        double sum = 0;
        double count = 0;
        double countNeg = 0;
        double countPos = 0;
        double avg;
        double n;
        Scanner sc = new Scanner(System.in);
        do {
            n = sc.nextDouble();
            if(n==0){
                break;
            }
            sum += n;
            count++;
            if (n > 0) {
                countPos++;
            } else if (n < 0) {
                countNeg++;
            }
        } while (n != 0);
        avg = sum / count;
        System.out.println("Positive numbers: " + countPos);
        System.out.println("Negative numbers: " + countNeg);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
