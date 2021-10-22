import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quotes {

    public static void main(String[] args) {

        JFrame window = new JFrame("Quotes");
        JPanel panel = new JPanel();
        JButton button = new JButton("inspirational quote");
        JButton button2 = new JButton("advisory quote");
        JButton button3 = new JButton("sad quote");

        window.setSize(350, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button.addActionListener(new ButtonListener1());
        button2.addActionListener(new ButtonListener2());
        button3.addActionListener(new ButtonListener3());

        panel.add(button);
        panel.add(button2);
        panel.add(button3);

        window.add(panel);
        window.setVisible(true);

    }
    private static class ButtonListener1 implements ActionListener{

        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "Cant expect to be chosen if you dont even put your name in the hat");

        }

    }
    private static class ButtonListener2 implements ActionListener{

        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "Better a life of oh wells than what ifs");

        }
    }
    private static class ButtonListener3 implements ActionListener{

        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "youd stop living to impress people if you noticed how quickly they forget the dead");

        }
    }
}
/*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */