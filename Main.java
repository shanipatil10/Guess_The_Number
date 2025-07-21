
import java.util.*;

class Game {
    private int rnumber;
    private int count;

    public Game() {
        Random random = new Random();
        rnumber = random.nextInt(100) + 1; // 1 to 100
        count = 0;
    }

    public boolean checkGuess(int number) {
        count++;
        if (number == rnumber) {
            System.out.println("You are correct!");
            System.out.println("Total attempts: " + count);
            return true;
        } else if (number < rnumber) {
            System.out.println("Try higher!");
        } else {
            System.out.println("Try lower!");
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        boolean correct = false;

        System.out.println("Guess the number between 1 and 100:");

        while (!correct) {
            System.out.print("Enter your guess: ");
            int number = sc.nextInt();
            correct = game.checkGuess(number);
        }

        sc.close();
    }
}
