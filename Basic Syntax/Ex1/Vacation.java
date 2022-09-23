package Ex1;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String DOW = scanner.nextLine();

        double TP = 0;

        switch (DOW) {
            case ("Friday"):
                if (type.equals("Students")) {
                    TP = count * 8.45;
                } else if (type.equals("Business") && count >= 100) {
                    TP = (count - 10) * 10.90;
                } else if (type.equals("Business")) {
                    TP = count * 10.90;
                } else {
                    TP = count * 15;
                } break;
            case ("Saturday"):
                if (type.equals("Students")) {
                    TP = count * 9.80;
                } else if (type.equals("Business") && count >= 100) {
                    TP = (count - 10) * 15.60;
                } else if (type.equals("Business")) {
                    TP = count * 15.60;
                } else {
                    TP = count * 20;
                } break;
            default:
                if (type.equals("Students")) {
                    TP = count * 10.46;
                } else if (type.equals("Business") && count >= 100) {
                    TP = (count - 10) * 16;
                } else if (type.equals("Business")) {
                    TP = count * 16;
                } else {
                    TP = count * 22.50;
                } break;
        }
        if (type.equals("Students") && count >= 30) {
            System.out.printf("Total price: %.2f", TP * 0.85);
        } else if (type.equals("Regular") && count >= 10 && count <= 20) {
            System.out.printf("Total price: %.2f", TP * 0.95);
        } else {
            System.out.printf("Total price: %.2f", TP);
        }
    }
}
