import java.util.Date;

public class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan(){
        // default values provided
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
        this.loanDate = new Date();
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate(){
        // returns the annual interest rate of this loan
        return annualInterestRate;
    }

    public int getNumberOfYears(){
        // returns the number of years of this loan
        return numberOfYears;
    }

    public double getLoanAmount(){
        // returns the amount of this loan
        return loanAmount;
    }

    public Date getLoanDate(){
        // returns the date of the creation of this loan
        Date loanDate = new Date();
        return loanDate;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        // sets a new interest rate for this loan
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears){
        // sets a new number of years for this loan
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount){
        // sets a new amount for this loan
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){
        // returns the monthly payment for this loan
        double monthlyInterestRate = (this.annualInterestRate / 12) / 100; // divide by 100 since it is in percent
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - (1 / Math.pow((1 + monthlyInterestRate), (numberOfYears * 12))));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        // returns the total payment for this loan
        double totalPayment = this.getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

}
