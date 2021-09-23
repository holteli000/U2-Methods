import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */
    /*
    the plan:
    1. get the input - a word with a p
    2. isolate or find the first p
    3. isolate three letters after p
    4.output
     */
    public static void main(String[] args) {

        String word = JOptionPane.showInputDialog(" enter a word with a p: ");

        JOptionPane.showMessageDialog(null, splitP(word));

    }

    public static String splitP(String word){

        int pIndex = word.indexOf('p');

        return word.substring(pIndex, pIndex + 4);


    }

}
