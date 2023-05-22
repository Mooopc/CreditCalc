public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int firstCreditAmount = 1_000_000;      //Сумма первого кредита
        int secondCreditAmount = 19_520_000;    //Сумма второго кредита
        int thirdCreditAmount = 550_000;        //Сумма третьего кредита
        double percent = 9.99;  //Процентная ставка
        int firstMonths = 12;   //Количество месяцев для первого кредита
        int secondMonths = 120;  //Количество месяцев для второго кредита
        int thirdMonths = 12;   //Количество месяцев для третьего кредита
        double firstAnnuityPayment = service.calculate(firstCreditAmount, percent, firstMonths); //Аннуитетный платёж
        System.out.println("Сумма ежемесячного платежа: " + (int) firstAnnuityPayment + " рублей");

        double secondAnnuityPayment = service.calculate(secondCreditAmount, percent, secondMonths); //Аннуитетный платёж
        System.out.println("Сумма ежемесячного платежа: " + (int) secondAnnuityPayment + " рублей");

        double thirdAnnuityPayment = service.calculate(thirdCreditAmount, percent, thirdMonths); //Аннуитетный платёж
        System.out.println("Сумма ежемесячного платежа: " + (int) thirdAnnuityPayment + " рублей");
    }
}