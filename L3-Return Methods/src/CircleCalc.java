import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {

    /*
    1. get the input - radius
    2. calculate area
    3. calculate circumference
    4. display results - output
     */


    public static void main(String[] args) {

       double radius = getInput("what is the radius");

       double area = area(radius);

       double circumference = circumference(radius);

       JOptionPane.showMessageDialog(null, displayResult(area, circumference));


    }
     public static double getInput(String prompt){
        return Double.parseDouble(JOptionPane.showInputDialog(prompt));
     }



    //re-write the method to calculate a circle's area using parameters and return statement
    public static double area(double radius){

        return Math.pow(radius, 2) * Math.PI;

    }

    //re-write the method to calculate a circle's perimeter using parameters and return statement
    public static double circumference(double radius){

        return 2 * Math.PI * radius;

    }

    public static String displayResult(double area, double circumference){

        DecimalFormat round = new DecimalFormat("#.00");

        String message = "the area is: " + round.format(area);
        message += "\nthe circumference is: " + round.format(circumference);

        return message;
    }
}
