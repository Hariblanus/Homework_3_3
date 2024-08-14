public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int amount = 1_000_000; // Сумма кредита в рублях
        double annualRate = 9.99; // Годовая процентная ставка
        int years = 3; // Cрок кредита в месяцах

        int monthlyPayment = service.calculate(amount, annualRate, years);
        System.out.println("Ежемесячный платёж: " + monthlyPayment + "₽");
    }
}