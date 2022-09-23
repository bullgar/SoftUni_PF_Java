package Ex1;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";


        int failed_attempts = 0;
        boolean blocked = false;
        for (int i = username.length() - 1; i >=0 ; i--) {
            char currSymbol = username.charAt(i);
            password+=currSymbol;
        }
        String input = scanner.nextLine();
        while(!input.equals(password)) {
                failed_attempts++;
                if (failed_attempts < 4) {
                    System.out.printf("Incorrect password. Try again.%n");
                    input = scanner.nextLine();
                } else {
                    System.out.printf("User %s blocked!", username);
                    blocked = true;
                    break;
                }
            }
        if (blocked == false){
            System.out.printf("User %s logged in.",username);
        }
    }
}


