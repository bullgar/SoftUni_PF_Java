package Ex1;

import java.util.Scanner;

public class RageCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lost_games = Integer.parseInt(scanner.nextLine());
        double headset_price = Double.parseDouble(scanner.nextLine());
        double mouse_price = Double.parseDouble(scanner.nextLine());
        double keyboard_price = Double.parseDouble(scanner.nextLine());
        double display_price = Double.parseDouble(scanner.nextLine());

        double rage_expenses = lost_games/2*headset_price + lost_games/3*mouse_price + lost_games/6*keyboard_price + lost_games/12*display_price;

        System.out.printf("Rage expenses: %.2f lv.", rage_expenses);


    }
}
