public class CreditPaymentService {
    public int calculate(int sum, double percent, int months){
        //Формула аннуитета
        double monthlyPayment = (((percent / 1200 * (Math.pow((1 + percent / 1200), months))) / (Math.pow((1 + percent / 1200), months) - 1)) * sum);
        return (int) monthlyPayment;
    }
}
