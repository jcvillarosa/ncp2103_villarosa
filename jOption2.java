import javax.swing.JOptionPane;
public class jOption2 {
    public static void main(String[] args)
    {
        double bill = 0;
        double tip = 0.0;

        bill = Double.parseDouble(JOptionPane.showInputDialog("Insert your bill: "));
        tip = Double.parseDouble(JOptionPane.showInputDialog("Insert your tip in percentage: "));

        double subtotal = bill*(tip/100);
        double total = subtotal+bill;

        JOptionPane.showMessageDialog(null, "Your tip is: " + String.format("%.2f",subtotal) + " Your total bill is: " + String.format("%.2f", total));

    }
}
