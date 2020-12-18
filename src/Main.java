public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthlyPayment1 = service.calculate(9.99, 1000000, 12);
        System.out.println(monthlyPayment1);

        double monthlyPayment2 = service.calculate(9.99, 1000000, 24);
        System.out.println(monthlyPayment2);

        double monthlyPayment3 = service.calculate(9.99, 1000000, 36);
        System.out.println(monthlyPayment3);
    }
}
