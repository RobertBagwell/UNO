
public class LoadedDie {
    static String guessString;

    int Loaded;
    public void setLoadedNum (int localNum){

       Loaded= localNum;
    }
    public int getLoadedNum (){
        return Loaded;
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
