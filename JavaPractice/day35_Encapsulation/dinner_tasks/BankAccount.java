package day35_Encapsulation.dinner_tasks;

    public class BankAccount {

        //DECLARE VARIABLES
        private String accountHolder;
        private long accountNumber;
        private double balance;

        //CONSTRUCTOR
        public BankAccount(String accountHolder, long accountNumber, double balance) {
            setAccountHolder(accountHolder);
            setAccountNumber(accountNumber);
            setBalance(balance);
        }

        //GETTER / SETTER

        public String getAccountHolder() {
            return accountHolder;
        }

        public void setAccountHolder(String accountHolder) {
            this.accountHolder = accountHolder;
        }

        public long getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {

            this.balance = balance;
        }

        //METHODS
        public void deposit(double depositAmount){

            if (depositAmount < 0){
                System.err.println("Deposit amount cannot be negative or equal zero");
                return;

            }
            balance += depositAmount;
        }

        public void withdraw(double withdrawAmount){
            if (withdrawAmount <= 0) {
                System.err.println("The withdraw amount cannot be negative or equal zero");
                return;
            }

            if (withdrawAmount > balance){
                System.err.println("Insufficient balance");
            }
            balance -= withdrawAmount;
        }

        public void checkBalance(){
            System.out.println(balance);
        }


        public String toString() {
            return "BankAccount \n" +
                    "accountHolder='" + accountHolder + '\'' +
                    ", accountNumber=" + accountNumber +
                    ", balance= $" + balance;

        }
    }