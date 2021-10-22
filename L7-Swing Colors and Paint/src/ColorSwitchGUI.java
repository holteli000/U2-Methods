import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ColorSwitchGUI {
    //Declare your frame, panel and three buttons.

    JFrame window = new JFrame("color switcheroo");
    JPanel panel = new JPanel();
    JButton buttonThemeDark = new JButton("Theme: Dark");
    JButton buttonThemeWarren = new JButton("Theme: warren");
    JButton buttonThemePrimary =new JButton("Theme: primary");

    public ColorSwitchGUI(){
        //create your GUI
        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

    //add action listeners to buttons
        buttonThemeDark.addActionListener(new ThemeDark());
        buttonThemeWarren.addActionListener(new ThemeWarren());
        buttonThemePrimary.addActionListener(new ThemePrimary());


        panel.add(buttonThemeDark);
        panel.add(buttonThemePrimary);
        panel.add(buttonThemeWarren);

        window.add(panel);
        window.setVisible(true);
    }

    //add listeners to change the colors. Don't forget to link them to buttons.
  private class ThemeDark implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            Color panelBack = new Color(38, 28, 44);
            Color buttonBack = new Color(62,44,65);
            Color buttonText = new Color(110,133,178);

            panel.setBackground(panelBack);
            buttonThemeDark.setForeground(buttonBack);
            buttonThemeDark.setForeground(buttonText);
            buttonThemeWarren.setForeground(buttonBack);
            buttonThemeWarren.setForeground(buttonText);
            buttonThemePrimary.setForeground(buttonBack);
            buttonThemePrimary.setForeground(buttonText);

        }
    }
    private class ThemeWarren implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            Color panelBack = new Color(26, 28, 32);
            Color buttonBack = new Color(244,244,244);
            Color buttonText = new Color(207,117,0);

            panel.setBackground(panelBack);
            buttonThemeDark.setForeground(buttonBack);
            buttonThemeDark.setForeground(buttonText);
            buttonThemeWarren.setForeground(buttonBack);
            buttonThemeWarren.setForeground(buttonText);
            buttonThemePrimary.setForeground(buttonBack);
            buttonThemePrimary.setForeground(buttonText);

        }
    }
    private class ThemePrimary implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            Color panelBack = Color.RED;
            Color buttonBack = Color.BLUE;
            Color buttonText = Color.GREEN;

            panel.setBackground(panelBack);
            buttonThemeDark.setForeground(buttonBack);
            buttonThemeDark.setForeground(buttonText);
            buttonThemeWarren.setForeground(buttonBack);
            buttonThemeWarren.setForeground(buttonText);
            buttonThemePrimary.setForeground(buttonBack);
            buttonThemePrimary.setForeground(buttonText);

        }
    }
}
