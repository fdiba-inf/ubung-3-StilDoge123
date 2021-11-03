package exercise3;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        boolean prime = true;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int divider = 2;
        while(divider<number/2)
        {
            if(number%divider==0){
                prime = false;
                break;
            }
            divider++;
        }
        System.out.println("Prime number: " + prime);
    }
}
