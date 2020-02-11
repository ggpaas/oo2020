//Kodutöö week 1
import java.util.Scanner;
public class HomeWork{
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        System.out.println("Please enter five positive integers: ");

        // lisab siia need arvud, mis ise paned
        final int num1 = scan.nextInt();
        final int num2 = scan.nextInt();
        final int num3 = scan.nextInt();
        final int num4 = scan.nextInt();
        final int num5 = scan.nextInt();
        scan.close();
        
        // arvutab need 
        final int sum =num1+num2+num3+num4+num5;
        final int product = num1*num2*num3*num4*num5;
        final double avg = sum / 5.0;

        //prindib need välja
        System.out.println("The sum is. " + sum);
        System.out.println("The product is. "+ product);
        System.out.println("The avarage is. " + avg);
    }
}        