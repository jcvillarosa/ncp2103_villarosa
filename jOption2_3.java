import javax.swing.JOptionPane;
public class jOption2_3 {
    public static void main(String[] args)
    {
        //d/km/p
        double distance = Double.parseDouble(JOptionPane.showInputDialog("Enter the distance you want to travel: "));
        double kmperG = Double.parseDouble(JOptionPane.showInputDialog("Enter the Kilometer per Gallon: "));
        double pperg = Double.parseDouble(JOptionPane.showInputDialog("Enter the price per gallon: "));

        double computation = distance/kmperG;
        double computation1 = computation*pperg;

        JOptionPane.showMessageDialog(null, "Distance: "+ distance + "\n Kilometer per Gallon: "+ kmperG +"\n Price per Gallon: " + pperg + "\n Your total expenses will be: " + String.format("%.2f",computation1));
    }
}
