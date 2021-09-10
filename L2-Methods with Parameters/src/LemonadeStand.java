import javax.swing.*;
import java.text.DecimalFormat;


public class LemonadeStand {


    public static double price16 = 0.50;
     public static double price20 = 0.99;
     public static double tax = 7.5;




    /*
        You run a very successful Lemonade Stand.

        You sell 16 oz. cups of lemonade for $0.50 and
        20 oz. cups of lemonade for $0.99.

        You also have to report your income to the IRS,
        so you include a 7.5% sales tax on all purchases.

        Create a program which will ask the number of 16oz and 20oz cups of lemonade and display the total cost with tax.

        Your program should include at least ONE method with two parameters.

     */

    public static void main(String[] args) {

        //prompt for number of 16s
        int num16 = Integer.parseInt(JOptionPane.showInputDialog(" how many 16 oz cups? "));
        //prompt for number of 20s
        int num20 = Integer.parseInt(JOptionPane.showInputDialog("how many 20oz cups? "));
        //calculate cost and output
        calculateCost(num16, num20);

    }

    public static void calculateCost(int num16, int num20) {

        DecimalFormat round = new DecimalFormat("$#,###.00");
        //cost of 16s
        double cost16 = num16 * price16;
        //cost of 20s
        double cost20 = num20 * price20;
        //calculate cost and output
         double totalCost = (cost16 + cost20) * (1 + tax/100.0);

        String message = "your order:";
        message +="\nNumber of 16 oz:" + num16;
        message += "\nNumber of 20 oz:" + num20;
        message += "\n\nyour total is:" + round.format(totalCost);

        JOptionPane.showMessageDialog(null, message);
    }

    public static void smallCups() {





    }

}
