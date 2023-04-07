import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Guesser { // This class will take a no. from the guesser.
    int g_no;
    Guesser() {
        System.out.print("Guesser Guess the Number : ");
        Scanner guess = new Scanner(System.in);
        g_no = guess.nextInt();
    }
}

class Empire {  // This class will compare player and guesser no and revels the winner.
    int guesser_no, player_no;
    boolean showResults(int n1, int n2, int i) {
        guesser_no = n1;
        player_no = n2;
        if(player_no == guesser_no)
            return true;
        else
            return false;  
    }
}

class Player {  // This class will take a no. from the player.
    int p_no;
    Player() {
        System.out.print("Player Guess the Number : ");
        Scanner play = new Scanner(System.in);
        p_no = play.nextInt();
    }
}

class a_GuesserGame {
    public static void main(String args[]) {
        Guesser g = new Guesser();
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Empire e = new Empire();
        boolean c1 = e.showResults(g.g_no, p1.p_no, 1);
        boolean c2 = e.showResults(g.g_no, p2.p_no, 2);
        boolean c3 = e.showResults(g.g_no, p3.p_no, 3);

        if(c1)
        System.out.println("Player1 Won! You gessed the correct number.");
        else if(c2)
        System.out.println("Player2 Won! You gessed the correct number.");
        else if(c3)
        System.out.println("Player3 Won! You gessed the correct number.");
        else
        System.out.println("All Players Loose's the game.");
        
    }
}