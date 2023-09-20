import javax.swing.JOptionPane;
import java.util.Random;
public class InBetweenGame {
    public static void main(String[] args) {
        double pocketMoney = 1000.00;
        Random random = new Random ();
        String message;

        while (pocketMoney > 0) {
            String betInput = JOptionPane.showInputDialog("Your current pocket money: PHP " + pocketMoney
                    + "\nEnter your bet amount (0 to exit):");
            double bet = Double.parseDouble(betInput);

            if (bet == 0) {
                break;
            }

            int card1 = random.nextInt(13) + 1; // Random roll between 1 and 6
            int card2 = random.nextInt(13) + 1;

            String guessInput = JOptionPane.showInputDialog("The cards are: " + "\n" + card1 + "\n" + card2
                    + "\nDo you think the next card will be 'In Between' (I) or 'Outside' (O) this cards? (I/O):");

            char guess = guessInput.toUpperCase().charAt(0);
            boolean isInBetween = Math.random() < 0.5;

            if ((guess == 'I' && isInBetween) || (guess == 'O' && !isInBetween)) {
                pocketMoney += bet;
                message = "Congratulations! You won PHP " + bet + ". Your new pocket money is PHP " + pocketMoney;
            } else {
                pocketMoney -= bet;
                message = "Sorry, you lost PHP " + bet + ". Your new pocket money is PHP " + pocketMoney;
            }

            JOptionPane.showMessageDialog(null, message);
        }

        JOptionPane.showMessageDialog(null, "Game over! Your pocket money is now zero. Thanks for playing!");
    }
}