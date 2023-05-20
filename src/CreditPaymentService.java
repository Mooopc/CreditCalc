public class CreditPaymentService {
    public double calculate (int credit, double percent, int months) {
        double interestRate = percent / 12 / 100; //Процентная ставка
        double result;
        result = credit * interestRate * Math.pow((1 + interestRate), months)/((Math.pow((1 + interestRate), months))-1);
        return (int) result;
    }
}
