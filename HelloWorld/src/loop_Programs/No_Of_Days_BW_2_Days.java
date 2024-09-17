package loop_Programs;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class No_Of_Days_BW_2_Days {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first date
        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String firstDateStr = scanner.nextLine();
        
        // Input second date
        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String secondDateStr = scanner.nextLine();
        
        // Parse the dates
        LocalDate firstDate = LocalDate.parse(firstDateStr);
        LocalDate secondDate = LocalDate.parse(secondDateStr);
        
        // Calculate the number of days between the two dates
        long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate);

        // Display the result
        System.out.println("Number of days between " + firstDate + " and " + secondDate + " is: " + daysBetween);

        scanner.close();
    }

}
