package job;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String message = "Enter an odd number bigger than 2 and smaller than 10 000:";
        System.out.println(message);
        boolean isInt = false;
        boolean isDouble = false;
        String number = scanner.nextLine();
        int n;//= Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        while (flag) {
            String[] numberArray = number.split("");
            for (int i = 0; i < numberArray.length; i++) {
                if (numberArray[i].equals(".")) {
                    isDouble = true;
                    System.out.println("Invalid number!");
                    System.out.println(message);
                    number = scanner.nextLine();
                    break;
                } else {
                    isInt = true;
                }
            }
            if (isInt) {
                n = Integer.parseInt(number);
                if (n % 2 != 0 && n > 2 && n < 10000) {
                    String dash = "-";
                    String star = "*";
                    for (int i = 0; i < n + 1; i++) {
                        for (int j = 0; j < n * 10; j++) {
                            if (i < (n + 1) / 2) {
                                if (j < n - i) {
                                    System.out.print(dash);
                                } else if (j < (2 * n) + i) {
                                    System.out.print(star);
                                } else if (j < (3 * n) - i) {
                                    System.out.print(dash);
                                } else if (j < (4 * n) + i) {
                                    System.out.print(star);
                                } else if (j < (6 * n) - i) {
                                    System.out.print(dash);
                                } else if (j < (7 * n) + i) {
                                    System.out.print(star);
                                } else if (j < (8 * n) - i) {
                                    System.out.print(dash);
                                } else if (j < (9 * n) + i) {
                                    System.out.print(star);
                                } else if (j < (10 * n) + i) {
                                    System.out.print(dash);
                                }
                            } else {
                                if (j < (n - i)) {
                                    System.out.print(dash);
                                } else if (j < (2 * n) - i) {
                                    System.out.print(star);
                                } else if (j < (2 * n) - (n - i)) {
                                    System.out.print(dash);
                                } else if (j < (3 * n) + (n - i)) {
                                    System.out.print(star);
                                } else if (j < (4 * n) - (n - i)) {
                                    System.out.print(dash);
                                } else if (j < (5 * n) - (n - i)) {
                                    System.out.print(star);
                                } else if (j < (6 * n) - i) {
                                    System.out.print(dash);
                                } else if (j < (7 * n) - i) {
                                    System.out.print(star);
                                } else if (j < (7 * n) - (n - i)) {
                                    System.out.print(dash);
                                } else if (j < (9 * n) - i) {
                                    System.out.print(star);
                                } else if (j < (9 * n) - (n - i)) {
                                    System.out.print(dash);
                                } else if (j < (10 * n) - (n - i)) {
                                    System.out.print(star);
                                } else if (j < (10 * n)) {
                                    System.out.print(dash);
                                }
                            }
                        }
                        if (i < n) {
                            System.out.println();
                        }
                    }
                    flag = false;
                } else {
                    System.out.println("Invalid number!");
                    System.out.println(message);
                    number = scanner.nextLine();
                }
            }
        }
    }
}
