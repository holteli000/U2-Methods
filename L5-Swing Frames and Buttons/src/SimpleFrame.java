
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleFrame
{

    public static void main(String[] args)
    {
        JFrame window = new JFrame("This is a simple window");
        JPanel panel = new JPanel();
        JButton button = new JButton("click for $1");

        window.setSize(350, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button.addActionListener(new ButtonListener());


       panel.add(button);
        window.add(panel);
        window.setVisible(true);


    }

    private static class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "you got $1");

        }


    }


}
