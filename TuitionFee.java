import javax.swing.JOptionPane;
public class TuitionFee {
    public static void main(String[] args){

        double initialTuition = Double.parseDouble(JOptionPane.showInputDialog("Enter initial tuition fee"));
        double increasedRate = Double.parseDouble(JOptionPane.showInputDialog("Enter annual Increased Rate"))/100;
        int years = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of years to calculate: "));

        String result = "Tuition for the next " + years + "years: \n";

        for ( int i = 1; i <= years;i++){
            initialTuition += initialTuition * increasedRate;
            result += "Year " + i + ": PHP" + String.format("%.2f", initialTuition)+"\n";
        }
        JOptionPane.showMessageDialog(null,result);
    }
}
