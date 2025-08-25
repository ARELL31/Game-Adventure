import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my Basic Adventure Game");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "! Let's start your adventure.");

        System.out.println("You find yourself on a plain, completely alone. You have no resources and need to get to a town quickly. What do you do? 
        \n[A] Walk left. 
        \n[B] Walk right. 
        \n[C] Walk straight ahead. 
        \n[D] Leave your body behind and die.");

        String election = sc.nextLine().toUpperCase();
        switch (election) {
            case "A":
                System.out.println("You walk left and find a river. You follow the river and eventually reach a town. You win!");
                break;
            case "B":
                System.out.println("You walk right and encounter a wild animal. You try to fight it but unfortunately, you lose. Game over.");
                break;
            case "C":
                System.out.println("You walk straight ahead and fall into a pit. You can't get out and eventually succumb to your injuries. Game over.");
                break;
            case "D":
                System.out.println("You leave your body behind and become a ghost. You can now haunt the town but cannot interact with the living. Game over.");
                break;
            default:
                System.out.println("Invalid choice. Please restart the game and choose A, B, C, or D.");
                break;
        }
        if election.equals("A"){
            System.out.println("You have a little money and some food. You enter the town and see a market. What do you do?
            \n[A] Buy supplies.
            \n[B] Look for a job.
            \n[C] Explore the town.
            \n[D] Leave the town.");
            String townChoice = sc.nextLine().toUpperCase();
            switch (townChoice) {
                case "A":
                    System.out.println("You buy supplies and prepare for your next adventure. But you need to find a place to stay. Game over.");\
                    break;
                case "B":
                    System.out.println("You find a job and start earning money. You can now live comfortably in the town. You win!");
                    break;
                case "C":
                    System.out.println("You explore the town and get lost. You can't find your way back and eventually run out of resources. Game over.");
                    break;
                case "D":
                    System.out.println("You leave the town and wander aimlessly. You eventually succumb to the elements. Game over.");
                    break;
                default:
                    System.out.println("Invalid choice. Please restart the game and choose A, B, C, or D.");
                    break;  
        }
    }
}