public class CreditPaymentService {

    public double calculate(int sumCredit, double rateYears, int period){
        double rateMonth = rateYears / (12 * 100);
        double anuaRatio = (rateMonth * Math.pow(1 + rateMonth,period) / (Math.pow(1 + rateMonth,period) - 1));
        double payment = anuaRatio * sumCredit;
        return payment;

    }
}
