package Ex1;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());


        double total_price = 0;
        double curr_price = 0;

        for (int i = 1; i <=N ; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int count = Integer.parseInt(scanner.nextLine());
            curr_price = days*1.00*count*1.00*price;
            total_price += curr_price;

            System.out.printf("The price for the coffee is: $%.2f%n",curr_price);

        }
        System.out.printf("Total: $%.2f", total_price );
    }
}
