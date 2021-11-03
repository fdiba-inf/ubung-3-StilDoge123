package exercise3;
import java.util.Scanner;
public class NamePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        for(int i = 0;i<text.length();i++)
        {
            char symbol = text.charAt(i);
            System.out.println("* " + symbol + " *");
        }
    }
}
