import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BasicCalculator {

    static JTextField inputField1, inputField2;
    static JLabel resultLabel;

    public static void main(String[] args) {

        JFrame window = new JFrame("simple calculator");
        JPanel panel = new JPanel();
        JLabel inputLabel1 = new JLabel("enter a number: ");
        JLabel inputLabel2 = new JLabel("enter a number: ");
        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);

        JButton subBut = new JButton("subtract");
        JButton addBut = new JButton("add");
        JButton multBut = new JButton("multiply");
        JButton divBut = new JButton("divide");

        resultLabel = new JLabel ("0.00");

        window.setSize(350,200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);


        addBut.addActionListener(new addListener());


        panel.add(inputLabel1);
        panel.add(inputField1);
        panel.add(inputLabel2);
        panel.add(inputField2);

        panel.add(resultLabel);

        panel.add(subBut);
        panel.add(multBut);
        panel.add(divBut);
        panel.add(addBut);

        window.add(panel);
        window.setVisible(true);

    }

    private static class addListener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent){
            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());

            resultLabel.setText(String.valueOf(number1 + number2));

        }



    }







}
 /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */