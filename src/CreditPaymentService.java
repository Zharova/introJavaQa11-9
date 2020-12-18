public class CreditPaymentService {
    public double calculate(double percent, int creditAmount, int duration) {
        double monthlyPercent = percent / 100 / 12;
        double payment = creditAmount * (monthlyPercent * Math.pow((1+monthlyPercent), duration))/(Math.pow((1+monthlyPercent), duration) - 1);
        return payment;
    }
}
