package Ex1;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double money = 0;
        double price = 0;
        boolean isGood = false;

        while (!input.equals("Start")) {
            double coin = Double.parseDouble(input);

            if (coin != 0.1 && coin != 0.2 && coin != 0.5 && coin != 1 && coin != 2) {
                System.out.printf("Cannot accept %.2f%n", coin);
            } else {
                money += coin;
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("End")) {

            switch (input){
                case ("Nuts"):
                    price = 2.0;
                    isGood=true;
                    break;
                case ("Water"):
                    price = 0.7;
                    isGood=true;
                    break;
                case ("Crisps"):
                    price = 1.50;
                    isGood=true;
                    break;
                case ("Soda"):
                    price = 0.8;
                    isGood=true;
                    break;
                case ("Coke"):
                    price = 1.0;
                    isGood=true;
                    break;
            }
            if (money<price){
                System.out.println("Sorry, not enough money");
            } else if (isGood){
                System.out.printf("Purchased %s%n", input);
                money -= price;
            } else {
                System.out.println("Invalid product");
            }
            input = scanner.nextLine();
        } System.out.printf("Change: %.2f", money);
    }
}


