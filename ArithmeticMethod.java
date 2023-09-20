import javax.swing.JOptionPane;
public class ArithmeticMethod {
    public static void main(String[]args){
        float input = Float.parseFloat(JOptionPane.showInputDialog("Input number>"));
        float input2 = Float.parseFloat(JOptionPane.showInputDialog("Input second number>"));

        float sum = additionNumbers(input,input2);
        float difference = subtractionNumber(input,input2);
        float product = multiplicationNumber(input,input2);
        float quotient = divisionNumber(input,input2);

        JOptionPane.showMessageDialog(null,"Results>\n Sum: "+ sum +"\n Difference: "+ difference+"\n Product: "+product+
                "\n Quotient: "+quotient);
    }
    public static float additionNumbers(float num1,float num2){
        float sum = num1 + num2;
        return sum;
    }
    public static float subtractionNumber(float num1, float num2){
        float difference = num1 - num2;
        return difference;
    }
    public static float multiplicationNumber(float num1, float num2){
        float product = num1 * num2;
        return product;
    }
    public static float divisionNumber(float num1 , float num2){
        float quotient = num1 / num2;
        return quotient;
    }
}
