package Ananya1;

	// Define a BankAccount class
	public class BankAccount 
	{
	    //fields for account holder name, bank name, and account balance
	    private String accountHolderName;
	    private String bankName;
	    private double accountBalance;

	    // Constructor to initialize account details
	    public BankAccount(String accountHolderName, String bankName, double initialBalance)
	    {
	        this.accountHolderName = accountHolderName;
	        this.bankName = bankName;
	        this.accountBalance = initialBalance;
	    }

	    // Method to retrieve account balance
	    public double getBalance() {
	        return accountBalance;
	    }

	    // Method to deposit money into the account
	    public void deposit(double amount) 
	    {
	        // Check if deposit amount is valid (greater than 0)
	        if (amount > 0) 
	            accountBalance += amount; // Update account balance
	        System.out.println("Deposited: " + amount);
	    }

	    // Method to withdraw money from the account
	    public void withdraw(double amount)
	    {
	    	// Check if withdrawal amount is valid (greater than 0 and sufficient funds)
	        if (amount > 0 && accountBalance >= amount) 
	            accountBalance -= amount; // Update account balance
	        System.out.println("Withdrawn: " + amount);
	    }

	    // Main method to demonstrate BankAccount usage
	    public static void main(String[] args) {
	        // Create three BankAccount objects with different account holders and banks
	        BankAccount account1 = new BankAccount("Ananya H K", "ICICI", 10000);
	        BankAccount account2 = new BankAccount("Sandeep", "HDFC", 5500);
	        BankAccount account3 = new BankAccount("Krishna", "SBI", 12000);

	        // Perform transactions on each account
	        account1.deposit(500);
	        account1.withdraw(200);
	        System.out.println("Account 1 Balance: " + account1.getBalance());
	        System.out.println("  ");
	        
	        account2.deposit(1000);
	        account2.withdraw(750);
	        System.out.println("Account 2 Balance: " + account2.getBalance());
	        System.out.println("  ");
	        
	        account3.deposit(1500);
	        account3.withdraw(500);
	        System.out.println("Account 3 Balance: " + account3.getBalance());
	    }
	}

	    



