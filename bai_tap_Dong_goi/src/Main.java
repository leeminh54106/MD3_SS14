public class Main {
    public static void main(String[] args) {
        int intNumber = ValidateData.getInt("Mời nhập vào số nguyên: ");
        double doubleNumber = ValidateData.getDouble("Mời nhập vào số thực: ");
        String stringNumber = ValidateData.getString("Mời nhập vào một chuỗi: ");

        System.out.println("Số nguyên là: " + intNumber);
        System.out.println("Số thực là: " + doubleNumber);
        System.out.println("Chuỗi: " + stringNumber);
    }
}