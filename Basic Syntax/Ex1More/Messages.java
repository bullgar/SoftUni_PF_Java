package Ex1More;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int presses = Integer.parseInt(scanner.nextLine());

        String message = "";

        for (int i = 0; i < presses; i++) {
            String number = scanner.nextLine();
            int number_length = number.length();
            int main_digit = number.charAt(0);
            int offset = (main_digit - 2)*3;
            if (main_digit==8 || main_digit==9){
                offset+=1;
            }


        }
        System.out.println(message);

    }
}