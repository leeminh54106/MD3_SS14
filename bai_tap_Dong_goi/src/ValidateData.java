import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidateData {
    private static Scanner scanner = new Scanner(System.in);

    public static int getInt(String message) {
        int number;
        while (true) {
            System.out.print(message);
            try {
                number = Integer.parseInt(scanner.nextLine());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Giá trị không hợp lệ, vui lòng nhập lại một số nguyên.");
                scanner.next();
            }
        }
        return number;
    }

    public static double getDouble(String message) {
        double number;
        while (true) {
            System.out.print(message);
            try {
                number = Double.parseDouble(scanner.nextLine());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Giá trị không hợp lệ, vui lòng nhập lại một số thực.");
                scanner.next();
            }
        }
        return number;
    }

    public static String getString(String message) {
        System.out.print(message);
        return scanner.next();
    }
}
