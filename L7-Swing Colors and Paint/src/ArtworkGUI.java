import javax.swing.*;
import java.awt.*;

import static java.awt.Color.black;
import static java.awt.Color.yellow;

public class ArtworkGUI {

    //DECLARE VARIABLES
    JFrame frame;

    public ArtworkGUI()
    { frame = new JFrame("Artwork");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new MyDrawing();

        frame.add(panel);
        frame.setVisible(true);




        //CREATE THE GUI
    }

    private class MyDrawing extends JPanel
    {
        public MyDrawing(){
            //Set the background color
            setBackground(Color.cyan);
        }

        //Add the PaintComponent Method and create your drawing.
        public void paintComponent(Graphics g){

            super.paintComponent(g);


            g.setColor(Color.green);
            g.fillRect(0, 500, 700, 100);

           g.setColor(Color.red);
           g.fillRect(175, 350, 400,100);

           g.setColor(Color.red);
            g.fillRect(175, 275, 300,100);

           g.setColor(black);
           g.fillRoundRect(200,400,100,100,100,100);

            g.setColor(black);
            g.fillRoundRect(475,400,100,100,100,100);

            g.setColor(yellow);
            g.fillRoundRect(530,340,50,50,100,100);






        }
    }
}
