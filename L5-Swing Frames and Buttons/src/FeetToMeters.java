import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class FeetToMeters {

        public static void main(String[] args) {

            JFrame window = new JFrame("distance conversion");
            JPanel panel = new JPanel();
            JButton feetToMeterBut = new JButton("feet to meters");
            JButton metersToFeetBut = new JButton("meters to feet");


            window.setSize(350, 100);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setLocationRelativeTo(null);


            feetToMeterBut.addActionListener(new FeetToMeter());
            metersToFeetBut.addActionListener(new MeterToFeet());

            panel.add(feetToMeterBut);
            panel.add(metersToFeetBut);
            window.add(panel);

            window.setVisible(true);

        }

        private static class FeetToMeter implements ActionListener {

            public void actionPerformed(ActionEvent actionEvent) {

                double feet = Double.parseDouble(JOptionPane.showInputDialog("enter the number of feet: "));
                double meters = feet / 3.28;
                JOptionPane.showMessageDialog(null, meters + "meters.");


            }
        }


        private static class MeterToFeet implements ActionListener {

            public void actionPerformed(ActionEvent actionEvent) {

                double meters = Double.parseDouble(JOptionPane.showInputDialog("enter the number of meters: "));
                double feet = meters * 3.28;
                JOptionPane.showMessageDialog(null, feet + "feet.");


            }

        }
    }
 /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */