import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        // read the input for annual interest rate
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = sc.nextDouble();

        // read the input for loan period
        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = sc.nextInt();

        // read the input for loan amount
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = sc.nextDouble();

        // calculate monthly payment by calling the Loan class
        Loan loanObj = new Loan(annualInterestRate, numberOfYears, loanAmount);

        // print the output for loan date
        System.out.println("The loan was created on " + loanObj.getLoanDate());

        // print the output for monthly payment
        System.out.println("The monthly payment is " + String.format("%.2f", loanObj.getMonthlyPayment()));

        // print the output for total payment
        System.out.println("The total payment is " + String.format("%.2f", loanObj.getTotalPayment()));
    }
}
