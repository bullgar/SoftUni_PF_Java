package Ex1;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fact = 1;
        int fact_sum = 0;

        String n = scanner.nextLine();


        for (int i = 0; i <=n.length()-1 ; i++) {

            fact =1;

            int curr_number = Character.getNumericValue(n.charAt(i));


            for (int j = 1; j <=curr_number ; j++) {
                fact = fact*j;

            }
            fact_sum+=fact;

        } if (fact_sum==Integer.parseInt(n)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}
