package Ananya1;

//Enum for Bank Names with interest rates
enum BankName {
 ICICI(6.3),
 HDFC(5.8),
 SBI(6.0);

 private final double interestRate;

 // Constructor for the enum
 BankName(double interestRate) {
     this.interestRate = interestRate;
 }

 // Getter for the interest rate
 public double getInterestRate() {
     return interestRate;
 }
}

//BankAccount class
class BankAccount {
 private double accountBalance;
 private String accountHolder;
 private BankName bankName;

 // Constructor for BankAccount
 public BankAccount(double accountBalance, String accountHolder, BankName bankName) {
     this.accountBalance = accountBalance;
     this.accountHolder = accountHolder;
     this.bankName = bankName;
 }

 // Method to calculate total interest
 public double calculateInterest(int numberOfYears) {
     return bankName.getInterestRate() * numberOfYears * accountBalance / 100;
 }

 // Method to display account details
 public void displayAccountDetails() {
     System.out.println("Account Holder: " + accountHolder);
     System.out.println("Bank Name: " + bankName);
     System.out.println("Account Balance: " + accountBalance);
 }
}

//Main class to demonstrate functionality
public class Main1 {
 public static void main(String[] args) {
     // Creating instances of BankAccount
     BankAccount account1 = new BankAccount(12000, "Harry", BankName.SBI);
     BankAccount account2 = new BankAccount(15000, "Alice", BankName.ICICI);
     
     // Displaying account details
     account1.displayAccountDetails();
     System.out.println("Total Interest for 5 years: " + account1.calculateInterest(5));
     System.out.println();

     account2.displayAccountDetails();
     System.out.println("Total Interest for 3 years: " + account2.calculateInterest(3));
 }
}


