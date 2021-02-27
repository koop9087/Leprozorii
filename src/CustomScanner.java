import java.util.Scanner;

public class CustomScanner {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static int scannerInt() {
        int num = SCANNER.nextInt();
        return num;
    }

    public static double scannerDouble() {
        double num = SCANNER.nextDouble();
        return num;
    }

    public static char scannerChar() {
        char num = SCANNER.next().charAt(0);
        return num;
    }

    public static String scannerString() {
        String num = SCANNER.nextLine();
        return num;
    }
}
