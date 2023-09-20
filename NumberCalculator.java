import javax.swing.JOptionPane;
public class NumberCalculator {
    public static void main (String[]args){
        int sumGreater10 = 0;
        int productLess5 = 1;
        int divisibleByThree = 0;
        int divisibleByFive = 0;
        int thriceEvenProduct = 1;

        while (true){
            int number = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer (0 to exit): "));
            if (number == 0){
                break;
            }if (number > 10){
                sumGreater10 += number;
            }if (number < 5){
                productLess5 *= number;
            }if (number % 3 == 0){
                divisibleByThree++;
            }if (number % 5 == 0){
                divisibleByFive++;
            }if (number % 2 == 0){
                thriceEvenProduct *= number;
            }
        }JOptionPane.showMessageDialog(null, "Sum of all numbers greater than 10: " + sumGreater10
        + "\nProduct of all numbers less than 5: " + productLess5 + "\nCount of numbers divisible by 3: " + divisibleByThree
        + "\nCount of numbers divisible by 5: " + divisibleByFive + "\nThrice the product of all even numbers: " + (thriceEvenProduct * 3));
    }
}
