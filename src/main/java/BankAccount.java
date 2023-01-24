public class BankAccount {
    String name;
    long accountNumber;
    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful. Current balance is $" + balance);
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Current balance is $" + balance);
        }
    }
    public double checkBalance() {
        return balance;
    }
}






//class BankAccount:
//        def __init__(self, name, account_number, balance):
//        self.name = name
//        self.account_number = account_number
//        self.balance = balance
//
//        def deposit(self, amount):
//        self.balance += amount
//        print(f"Deposited {amount}. New balance: {self.balance}")
//
//        def withdraw(self, amount):
//        if self.balance >= amount:
//        self.balance -= amount
//        print(f"Withdrew {amount}. New balance: {self.balance}")
//        else:
//        print("Insufficient funds.")
//
//        def check_balance(self):
//        print(f"Balance: {self.balance}")


     
//        # Creating an object of BankAccount class
//        account = BankAccount("John Doe", "123456", 1000)
//
//        # Check initial balance
//        account.check_balance() # prints "Balance: 1000"
//
//        # Deposit $500
//        account.deposit(500) # prints "Deposited 500. New balance: 1500"
//
//        # Withdraw $200
//        account.withdraw(200) # prints "Withdrew 200. New balance: 1300"
//
//        # Withdraw $5000
//        account.withdraw(5000) # prints "Insufficient funds."