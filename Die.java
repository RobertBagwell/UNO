import javax.swing.JOptionPane;
public class Die {
    static String guessString;

    private int die;
    private int die2;

    int randomNum;

    public void setDie (int tempDie){

        die = tempDie;
    }
    public int getDie(){
        return die;
    }

    public void setDie2 (int tempDie2){

        die2 = tempDie2;
    }
    public int getDie2(){
        return die2;
    }





//    public static int UserGuess (int MIN, int MAX){
//
//        guessString = JOptionPane.showInputDialog( null, "Guess a number between " + MIN + " and " + MAX); //takes user input.
//        return Integer.parseInt(guessString);
//
//    }
//
//    public static void OutPutToUser (int random, int guess, boolean isMatch){
//
//        JOptionPane.showMessageDialog(null, "Your guess was " + (random - guess) + " numbers away.");
//
//        JOptionPane.showMessageDialog(null, "The result is "  + isMatch  + ".");
//
//
//    }


}