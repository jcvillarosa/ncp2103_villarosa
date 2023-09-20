import javax.swing.JOptionPane;
public class GuessingGame {
    public static void main (String[]args){
        int randomNumber = (int) (Math.random()*11);
        int tries = 0;

        while (true){
            int guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a random number: "));

            if (guess == randomNumber){
                JOptionPane.showMessageDialog(null,"You guessed the correct number!");
                break;
            }else if (guess < randomNumber){
                JOptionPane.showMessageDialog(null,"Your guessed number is low");
            }else {
                JOptionPane.showMessageDialog(null,"Your guessed number is high");
            }
            tries++;
        }
        String rank;
        if(tries == 1){
            rank ="Pro";
        }else if (tries <= 3){
            rank = "Expert";
        }else if (tries <= 6){
            rank = "Beginner";
        }else{
            rank = "Novice";
        }
        JOptionPane.showMessageDialog(null,"Your rank is: "+ rank);
    }
}
