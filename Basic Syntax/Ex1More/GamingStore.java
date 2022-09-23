package Ex1More;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double price = 0;
        double spent = 0;
        boolean missing = false;

        while (!input.equals("Game Time")) {

            switch (input) {
                case ("OutFall 4"):
                case ("RoverWatch Origins Edition"):
                    price = 39.99;
                    break;
                case ("CS: OG"):
                    price = 15.99;
                    break;
                case ("Zplinter Zell"):
                    price = 19.99;
                    break;
                case ("Honored 2"):
                    price = 59.99;
                    break;
                case ("RoverWatch"):
                    price = 29.99;
                    break;
                default:
                    missing = true;
            }
            if (missing == true) {
                System.out.println("Not Found");
                input = scanner.nextLine();
                missing = false;
            } else if (balance < price) {
                System.out.println("Too Expensive");
                input = scanner.nextLine();
            } else if (price<=balance) {
                balance -= price;
                spent += price;
                System.out.printf("Bought %s%n", input);
                input = scanner.nextLine();
            }
            if (balance == 0) {
                System.out.println("Out of money!");
                break;
            }

        } System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, balance);
    }
}
