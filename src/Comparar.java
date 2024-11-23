/*
*@author: Daiane Tararam
*/
import javax.swing.JOptionPane;

public class Comparar {
    public static void main(String[] args) {
        char letra1 = 'a';
        char letra2= 'f';
        //Comparar qual a maior letra
        char maior = (char) Math.max(letra1, letra2);
        //Comparar qual a menor letra
        char menor = (char) Math.min(letra1, letra2);

        JOptionPane.showMessageDialog(null, "A letra '"+ menor + "' vem antes da letra '" + maior + "' no alfabeto.");

    }

}
