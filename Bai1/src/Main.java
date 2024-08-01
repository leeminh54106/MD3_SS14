import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số thứ nhất: ");
        double firstNumber = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập vào số thứ hai: ");
        double secondNumber = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập vào số thứ ba: ");
        double lastNumber = Double.parseDouble(sc.nextLine());

        PhuongTrinhBacHai pt = new PhuongTrinhBacHai(firstNumber, secondNumber, lastNumber);
        pt.solveTheEquation();

    }
}