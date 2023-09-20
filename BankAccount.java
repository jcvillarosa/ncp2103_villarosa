import javax.swing.JOptionPane;
public class BankAccount {
    public static void main(String[]args){
        Integer initialBalance = Integer.parseInt(JOptionPane.showInputDialog("Welcome to the Simple Banking System! \nInput your Initial balance: "));
        int currentBalance = initialBalance;

        while(true){

            int options = Integer.parseInt(JOptionPane.showInputDialog("Menu: \n 1. Check Balance \n 2. Deposit Money \n 3. Withdraw Money \n 4. Quit"));
            if (options == 1){
                JOptionPane.showMessageDialog(null,"Your balance is: " + initialBalance + "PHP");
            }else if( options == 2){
                int deposit = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to deposit: "));
                initialBalance+=deposit;
                JOptionPane.showMessageDialog(null,"Your new balance is: "+ initialBalance + "PHP");
                //JOptionPane.showMessageDialog(null,"Your new balance is: "+ currentBalance + "PHP");
            }else if( options == 3){
                int withdraw = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount to withdraw: "));

                if (withdraw > currentBalance) {
                    JOptionPane.showMessageDialog(null, "Sorry, you cannot withdraw this amount.");
                }else{
                    initialBalance -= withdraw;
                    JOptionPane.showMessageDialog(null,"Withdraw successful!");
                    }

            }else if(options == 4) {
                JOptionPane.showMessageDialog(null, "Thank you for using the Simple Banking System");
                break;
            }
        }

    }
}
