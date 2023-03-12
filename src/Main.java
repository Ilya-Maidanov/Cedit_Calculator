public class Main {
    public static void main(String[] args) {

        int sumCredit = 1_000_000; //Сумма кредита
        double rateYear = 9.99; // Процентная ставка
        int period = 36; // Срок кредита

        CreditPaymentService service = new CreditPaymentService();
        double credit = service.calculate(sumCredit, rateYear, period);

        System.out.println("Сумма кредита:" + " " + sumCredit);
        System.out.println("Процентная ставка:" + " " + rateYear);
        System.out.printf("Ежемесячный платеж:" + " " + "%.0f",credit);

    }

}
