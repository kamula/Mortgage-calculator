import java.util.Scanner;

public class Main {
    private static final int MONTHS_IN_A_YEAR = 12;
    public static void main(String[] args) {
//        get input from user: PRINCIPLE,ANNUAL_INTEREST_RATE & TERM_IN_YEARS
//        P = PRINCIPLE,
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principle amount");
        double principle = scanner.nextDouble();

        System.out.println("Enter the annual interest rate");
        float annual_interest_rate = scanner.nextFloat();

        System.out.println("Enter loan term in years");
        int term_in_years = scanner.nextInt();

        float monthly_interest_rate = annual_interest_rate / MONTHS_IN_A_YEAR;
        int number_of_payments = term_in_years * MONTHS_IN_A_YEAR;

//        formula implementation
        double monthly_payment = principle * (
                (monthly_interest_rate * (Math.pow(1+monthly_interest_rate,number_of_payments)))/
                        ((Math.pow(1+monthly_interest_rate,number_of_payments)) -1)
                );
        System.out.println("Monthly payment: "+ monthly_payment);
    }
}