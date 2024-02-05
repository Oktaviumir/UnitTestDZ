package Calculator;

public class CalculatorDiscount {

    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        double discountedAmount;

        if (purchaseAmount >= 0) {
            if (discountAmount >= 0 && discountAmount <= 70) {
                discountedAmount = purchaseAmount - (purchaseAmount * discountAmount) / 100;
            } else if (discountAmount < 0) {
                throw new ArithmeticException("Скидка не может быть отрицательной");
            } else {
                throw new ArithmeticException("Скидка должна быть в диапазоне от 0 до 70%");
            }
        } else {
            throw new ArithmeticException("Сумма покупки не бывает отрицательной");
        }
        return discountedAmount;
    }
}
