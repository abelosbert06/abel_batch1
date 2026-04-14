package util;

import java.util.Scanner;

public class InputUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine();
    }

    public static int getInt() {
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public static void waitForEnter() {
        System.out.println("[Press Enter to continue...]");
        scanner.nextLine();
    }
}