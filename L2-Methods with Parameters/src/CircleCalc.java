import javax.swing.*;
import java.text.DecimalFormat;
public class CircleCalc {


    public static void main(String[] args) {
        double radius = Double.parseDouble(JOptionPane.showInputDialog("what is the radius?"));
        area(radius);
        circumference(radius);

        //create and run the program

    }

    //re-write the method to calculate a circle's area using parameters
    public static void area(double radius){

        DecimalFormat round = new DecimalFormat("#,##");
        double area = Math.PI * Math.pow(radius, 2);

        JOptionPane.showMessageDialog(null, "the area is " + area);
    }

    //re-write the method to calculate a circle's perimeter using parameters
    public static void circumference(double radius){

        DecimalFormat round = new DecimalFormat("#,##");


        double circumference = 2 * Math.PI * radius;

        JOptionPane.showMessageDialog(null, "the circumference is " + round.format(circumference));

    }
}
