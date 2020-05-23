import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String firstName = getUserName(NameType.ees);
        String lastName = getUserName(NameType.perekonna);
        System.out.println(firstName + " " + lastName);
        JobType jobType = getUserJob();
        String date = getUserDate();
        System.out.println(firstName + " " + lastName + " tellis " + jobType + "  kuupäevaks: " +  date);
    }

    private static String getUserDate() {
        System.out.println("Meil on vaja kuupäeva\nNt: 14.06.2020");
        String day;
        String month;
        String year;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Selleks on vaja meil päeva\nPäev: ");
            day = scanner.nextLine();
        } while (!testDateInput(day, 31, false));
        do {
            System.out.println("Selleks on vaja meil Kuud\nKuu: ");
            month = scanner.nextLine();
        } while (!testDateInput(month, 12, false));
        do {
            System.out.println("Selleks on vaja meil aastat\nAasta: ");
            year = scanner.nextLine();
        } while (!testDateInput(year, 2020, true));

        return day + "." + month + "." + year;
    }

    private static boolean testDateInput(String date, int maxNumber, boolean isBigger) {
        try {
            int number = Integer.parseInt(date);
            if (isBigger) {
                return number >= maxNumber;
            } else {
                return number <= maxNumber;
            }
        } catch (NumberFormatException ignore) {
            return false;
        }

    }

    private static JobType getUserJob() {
        Integer number = 1; //Algvaartus
        HashMap<Integer, JobType> hashMap = new HashMap<>();

        /* Kaib need koik labi ja lisab listi */
        for (JobType title :
                JobType.values()) {
            System.out.println(number + ") " + title);
            hashMap.put(number, title);
            number++;
        }

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Sisesta oma valik: ");
            String userInput = scanner.nextLine();
            int number2 = Integer.parseInt(userInput);
            if (number2 > hashMap.size()) {
                System.out.println("sisesta number uuesti: ");
            } else if (number2 < 1) {
                System.out.println("sisesta number uuesti: ");
            } else {
                return hashMap.get(Integer.parseInt(userInput));
            }
        }

    }

    private static String getUserName(NameType nametype) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Sisesta oma %s nimi: ", nametype);
            String userInput = scanner.nextLine();

            if (isCorrectUsername(userInput)) {
                return userInput;
            }
        }
    }

    private static boolean isCorrectUsername(String userInput) {
        return !userInput.matches(".*[1234567890,.<>/`~'].*");
    }
}