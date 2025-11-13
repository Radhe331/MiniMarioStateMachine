import java.util.Scanner;

public class Game 
{

    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        Mario mario = new Mario();

        System.out.println("Welcome to Mini Mario State Machine!");
        System.out.println("Commands: mushroom, star, enemy, pit, coin, status, quit");

        while (true) 
        {
            System.out.print("> ");
            String cmd = kb.nextLine().trim().toLowerCase();

            if (cmd.equals("quit")) 
            {
                System.out.println("Goodbye!");
                break;
            }

            switch (cmd) {
                case "mushroom":
                    mario.stepTaken();
                    mario.onMushroom();
                    break;

                case "star":
                    mario.stepTaken();
                    mario.onStar();
                    break;

                case "enemy":
                    mario.stepTaken();
                    mario.onEnemy();
                    break;

                case "pit":
                    mario.stepTaken();
                    mario.onPit();
                    break;

                case "coin":
                    mario.stepTaken();
                    mario.collectCoin();
                    System.out.println("Mario collected a coin! (+10 points)");
                    break;

                case "status":
                    mario.printStatus();
                    break;

                default:
                    System.out.println("Unknown command.");
            }

            // Check for game over
            if (mario.getState() instanceof DeadMarioState) {
                mario.printStatus();
                System.out.println("Game over! Mario survived " + mario.getSteps() + " steps.");
                break;
            }
        }

        kb.close();
    }
}
