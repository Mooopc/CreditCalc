public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int FirstCreditAmount = 1_000_000;      //Сумма первого кредита
        int SecondCreditAmount = 19_520_000;    //Сумма второго кредита
        int ThirdCreditAmount = 550_000;        //Сумма третьего кредита
        double percent = 9.99;  //Процентная ставка
        int FirstMonths = 12;   //Количество месяцев для первого кредита
        int SecondMonths = 120;  //Количество месяцев для второго кредита
        int ThirdMonths = 12;   //Количество месяцев для третьего кредита
        double FirstAnnuityPayment = service.calculate(FirstCreditAmount, percent, FirstMonths); //Аннуитетный платёж
        System.out.println("Сумма ежемесячного платежа: " + (int) FirstAnnuityPayment + " рублей");

        double SecondAnnuityPayment = service.calculate(SecondCreditAmount, percent, SecondMonths); //Аннуитетный платёж
        System.out.println("Сумма ежемесячного платежа: " + (int) SecondAnnuityPayment + " рублей");

        double ThirdAnnuityPayment = service.calculate(ThirdCreditAmount, percent, ThirdMonths); //Аннуитетный платёж
        System.out.println("Сумма ежемесячного платежа: " + (int) ThirdAnnuityPayment + " рублей");
    }
}