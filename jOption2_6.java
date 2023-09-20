import javax.swing.JOptionPane;
public class jOption2_6 {
    public static void main(String[] args)
    {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number: "));

        if(number % 3 == 0)
        {
            JOptionPane.showMessageDialog(null, "HEP-HEP");
        }
        if(number % 3 == 0 && number % 5 == 0)
        {
            JOptionPane.showMessageDialog(null, "HEP_HEP HOORAY");
        }
        if(number % 5 == 0)
        {
            JOptionPane.showMessageDialog(null, "HOORAY");
        }

        else
        {
            JOptionPane.showMessageDialog(null, "oh no");
        }

    }

}
