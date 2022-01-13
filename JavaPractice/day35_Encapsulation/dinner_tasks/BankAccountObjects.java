package day35_Encapsulation.dinner_tasks;

public class BankAccountObjects {

    public static void main(String[] args) {

        BankAccount aizadasAccount = new BankAccount("Aizada", 1234567, 10);


        System.out.println(aizadasAccount);

        //depositing $5000

        aizadasAccount.deposit(1000);
        aizadasAccount.checkBalance();


        aizadasAccount.withdraw(500);
        aizadasAccount.checkBalance();









    }
}