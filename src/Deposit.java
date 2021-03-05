public class Deposit {
    public static void main(String[] args) {
        int deposit = 10000;
        int monthsCount = 10;
        int monthsCountPerYear = 12;
        double rate = 12.0;
        double percentageDivider = 100.0;
        double sum = deposit;
        double monthPercentage = rate / percentageDivider / monthsCountPerYear;

        for (int i = 1; i <= monthsCount; i++) {
            sum += sum * monthPercentage;
        }

        double profit = sum - deposit;

        System.out.printf("Total amount: %.2f. The profit was: %.2f", sum, profit);
    }
}
