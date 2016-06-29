/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculations;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Calculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the First Number");
            double x = input.nextDouble();

            System.out.println("Enter the Second Number");
            double y = input.nextDouble();

            System.out.println("Choose what you want to do [1-8]");

            System.out.println("1. Add");
            System.out.println("10. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Find the Power");
            System.out.println("6. Find the Root");
            System.out.println("7. Calculate Maximum Value");
            System.out.println("8. Calculate Minimum Value");
            System.out.println("9. Exit the Program");

            int choice = input.nextInt();

            double total = 1;
            double number = input.nextDouble();

            switch (choice) {
                case 1:
                    total = x + y;
                    break;
                case 2:
                    total = x - y;
                    break;
                case 3:
                    total = x * y;
                    break;
                case 4:
                    total = x / y;
                    break;
                case 5:
                    total = Math.pow(x, y);
                    break;
                case 6:
                    total = Math.sqrt(x);
                    break;
                case 7:
                    if (x > y) {
                        total = x;
                    } else {
                        total = y;
                    }
                    break;
                case 8:
                    if (x < y) {
                        total = y;
                    } else {
                        total = x;
                    }
                    break;
                case 9:
                    System.out.println(" Have a Nice day! :) ");
                    System.exit(choice);
                    break;

            }

            System.out.println("The Answer is" + total);

            System.out.println("Do you want to Continue? [Y/N]");
            String ch = input.next();
            if (ch.equalsIgnoreCase("n")) {
                System.out.println(" Good bye, Have a nice day! :) ");
                System.exit(0);
            }

        }

    }

}
