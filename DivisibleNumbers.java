import javax.swing.JOptionPane;
public class DivisibleNumbers {
    public static void main(String[] args){
        int start = Integer.parseInt(JOptionPane.showInputDialog("Enter start number: "));
        int end = Integer.parseInt(JOptionPane.showInputDialog("Enter end number"));

        int divisibleByTwo = 0;
        int divisibleByThree = 0;
        int divisibleByBoth = 0;

        for(int number = start; number <= end; number++){
           if (number % 2 == 0){
               divisibleByTwo++;
           }if(number % 3 == 0){
               divisibleByThree++;
            }if ((number % 2 == 0) && (number % 3 == 0)){
               divisibleByBoth++;
            }
        }
        JOptionPane.showMessageDialog(null,"Numbers divisible by two is: " + divisibleByTwo
        + "\nNumber divisible by three is: " + divisibleByThree + "\nNumber divisible by both is: " + divisibleByBoth);
    }
}
