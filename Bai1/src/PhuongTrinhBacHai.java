public class PhuongTrinhBacHai {
    private double firstNumber;
    private double secondNumber;
    private double lastNumber;

    public PhuongTrinhBacHai(double firstNumber, double secondNumber, double lastNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.lastNumber = lastNumber;
    }

    public void solveTheEquation() {
        double delta = secondNumber * secondNumber - 4 * firstNumber * lastNumber;
        if (delta > 0) {
            double testOne = (-secondNumber + Math.sqrt(delta)) / (2 * firstNumber);
            double testTwo = (-secondNumber - Math.sqrt(delta)) / (2 * firstNumber);
            System.out.println("Phương trình có hai nghiệm phân biệt");
            System.out.println("Nghiệm 1: " + testOne);
            System.out.println("Nghiệm 2: " + testTwo);
        } else if (delta == 0) {
            double test = -secondNumber / (2 * firstNumber);
            System.out.println("Phương trình có nghiệm kép: ");
            System.out.println("Nghiệm kép: " + test);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
