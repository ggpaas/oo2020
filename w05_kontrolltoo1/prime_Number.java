import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * prime_Number
 */
public class prime_Number {

    public static void main(String[] args) throws IOException {
        Scanner variable = new Scanner(System.in);

        System.out.println("Palun sisetage mingi arv");
        int number = variable.nextInt();

        System.out.println("Teie sisestasite arvu: " + number);

        if (number % 2 == 0) {
            System.out.println("arv jagub 2ga");
        } else if (number % 3 == 0) {
            System.out.println("arv jagub 3mega");
        } else if (number % 5 == 0) {
            System.out.println("arv jagub 5mega");
        } else if (number % 7 == 0) {
            System.out.println("arv jagub 7mega");
        } else {
            System.out.println("Teie arv ei jagu 2,3,5 ega 7mega");
        }

        function(number);
        checkPrimeNumbers();
    }

    public static void function(int number) {

        boolean check = false;
        for (int i = 2; i <= number / 2; ++i) {
            // kontrollime kas arv jagub kahe või number jagatud 2ga vahemikus. kui jagub,
            // siis ta pole algarv
            if (number % i == 0) {
                check = true;
            }
        }
        if (!check) {
            System.out.println("Teie arv on algarv");
        } else {
            System.out.println("Teie arv ei ole algarv");
        }
    }

    private static void checkPrimeNumbers() throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        /* opens this file at the beginning*/
        File file = new File("1000Primes.txt");

        /* And creates a bufferreader to read the file*/
        BufferedReader br = new BufferedReader(new FileReader(file));

        String fileString;

        /* Goes through all rows*/
        while ((fileString = br.readLine()) != null) {

            /* splits all lines*/
            String[] numberString = fileString.split(" ");

            /* Checks all lines */
            for (String s : numberString) {
                /*
                 * This is where all the magic lies.
                 * If it can convert a string to a number, it will add it to the list,
                 * and if it cannot, it will not do anything.
                 */
                try {
                    int number = Integer.parseInt(s);
                    arrayList.add(number);
                } catch (NumberFormatException ignored) {
                }
            }
        }

        /* First and last 10 elements in arrayList */
        System.out.println("Esimesed 10 arvu on: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("Viimased 10 arvu on: ");
        for (int i = 990; i < 1000; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
