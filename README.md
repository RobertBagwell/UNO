# UNO
UNO-special function

import java.util.Scanner;
public class specialFunction {
    int nextplayer;
    int numPlayerTurn;
    boolean clockWise = true;
    Scanner input = new Scanner(System.in);

    if (skip == cardPlayed){
        nextplayer = nextplayer + 1;
    }else if (reverse == cardPlayed){
        //reverse function?
        if (clockWise){
            clockWise = false;
        }else clockWise = true;

    }else if (draw2 == cardPlayed){
        nextplayerHand = draw2FromDeck;
        nextplayer = nextplayer + 1;
    }else if (wild == cardPlayed){
        System.out.println("Please pick a color:(B)Blue (R)Red (G)Green (Y)Yellow");
        currentColor = input.next();
    }else {
        nextplayerHand = draw4FromDeck;
        nextplayer = nextplayer + 1;.
    }
}
# Auto detect text files and perform LF normalization
* text=auto
