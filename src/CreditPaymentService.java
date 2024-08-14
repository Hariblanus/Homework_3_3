public class CreditPaymentService {
    public int calculate(int amount, double annualRate, int years) {
        int months = years * 12;
        double monthlyRate = annualRate / 12 / 100; // Ежемесячная процентная ставка
        double annuityRate = (monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1); // Формула расчета аннуитетного коэффициента
        double monthlyPayment = amount * annuityRate; // Ежемесячный платеж
        return (int) monthlyPayment; // Приведение к целому числу
    }
}