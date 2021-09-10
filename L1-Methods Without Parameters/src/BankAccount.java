import javax.swing.*;

public class BankAccount {

    //create a program which simulates a bank account

    public static void main(String[] args) {
     deposit();
     withdraw();
    }

    /*write a method to simulate a deposit.
    Prompt the user to enter their balance and the deposit amount,
    then display the new balance. */

    public static void deposit(){

        double balance =  Double.parseDouble(JOptionPane.showInputDialog("what is your current balance? "));
        double  deposit = Double.parseDouble(JOptionPane.showInputDialog("what is your amount?"));

        balance += deposit;

        JOptionPane.showMessageDialog(null, "your new balance is: " + balance);


    }


    /*write a method to simulate a withdrawal.
    Prompt the user to enter their balance the withdrawal amount,
    then display the new balance.
     */

     public static void withdraw(){

         double balance =  Double.parseDouble(JOptionPane.showInputDialog("what is your current balance? "));
         double  withdraw = Double.parseDouble(JOptionPane.showInputDialog("what is your withdrawal amount?"));

         balance -= withdraw;

         JOptionPane.showMessageDialog(null, "your new balance is: " + balance);





     }

}
