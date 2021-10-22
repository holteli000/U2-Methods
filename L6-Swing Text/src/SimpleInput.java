import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleInput {

    static int clickerCount = 0 ;
    static JLabel clickerCountLabel;
    static JTextField textInputField;

    public static void main(String[] args) {



       JFrame window = new JFrame("clicker game");
       JPanel panel = new JPanel();
       textInputField = new JTextField(10);
        clickerCountLabel = new JLabel("balance : $");
       JLabel textInputLabel = new JLabel();
       JButton clicker = new JButton("click for $1");

       clicker.addActionListener(new ClickerListener());

       window.setSize(250, 200);
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       window.setLocationRelativeTo(null);

       panel.add(textInputLabel);
       panel.add(textInputField);
       panel.add(clickerCountLabel);
       panel.add(clicker);
        window.add(panel);


        window.setVisible(true);
    }

    private static class ClickerListener implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent){

            int multiplier = Integer.parseInt(textInputField.getText());



            clickerCount += multiplier;

            clickerCountLabel.setText("Balance: $"+ clickerCount);


        }



    }





}
