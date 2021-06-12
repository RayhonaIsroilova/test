package pdp_lessons.module1.lesson3;

import java.util.Scanner;

public class RepeatNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean notFount = true;
        String repeatNUmber = " ";

        int fourth = number % 10;
        number = number / 10;

        int third = number % 10;
        number = number / 10;

        int second = number % 10;
        number = number / 10;

        int first = number % 10;

        boolean combination1 = (first == second || first == third || first == fourth);
        boolean combination2 = (first == second && first == third && first == fourth);
        boolean combination3 = (first != second && (second == third || second == fourth));
        boolean combination4 = (third == fourth);

        if (combination1) {
            repeatNUmber += first + " ";
            notFount = false;
        }
        if (combination3) {
            repeatNUmber += second + " ";
            notFount = false;
        }
        if (combination4 && !combination2) {
            repeatNUmber += third + " ";
            notFount = false;
        }

        if (notFount) {
            System.out.println("Takrorlanuvchi raqam yo'q.");
        } else {
            System.out.println("Takrorlanuvchi raqam:" + repeatNUmber);
        }
    }
}
