import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        get input from user: PRINCIPLE,ANNUAL_INTEREST_RATE & TERM_IN_YEARS
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principle amount");
        double principle = scanner.nextDouble();

        System.out.println("Enter the annual interest rate");
        float annual_interest_rate = scanner.nextFloat();

        System.out.println("Enter loan term in years");
        int term_in_years = scanner.nextInt();
    }
}