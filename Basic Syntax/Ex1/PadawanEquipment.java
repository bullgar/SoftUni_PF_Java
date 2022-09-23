package Ex1;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int student_count = Integer.parseInt(scanner.nextLine());
        double ls_price = Double.parseDouble(scanner.nextLine());
        double robe_price = Double.parseDouble(scanner.nextLine());
        double belt_price = Double.parseDouble(scanner.nextLine());

        int free_belts = student_count/6;

        double expenses = student_count*ls_price + (Math.ceil(student_count*0.1)*ls_price) + belt_price*student_count - free_belts*belt_price + robe_price*student_count;

        if (expenses-budget<=0){
            System.out.printf("The money is enough - it would cost %.2flv.", expenses);
        } else{
            System.out.printf("George Lucas will need %.2flv more.", expenses-budget);
        }

    }
}
