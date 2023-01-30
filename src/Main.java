public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        
        int sum = 1000000;
        double percent = 9.99;
        int months = 12;
        
        int monthlyPayment12 = service.calculate(sum, percent, months);
        int monthlyPayment24 = service.calculate(sum, percent, 2 * months);
        int monthlyPayment36 = service.calculate(sum, percent, 3 * months);
        
        System.out.println("Срок кредита: 1 год, ежемесячный платеж: " + monthlyPayment12 + ", процентная ставка: 9,99%.");
        System.out.println("Срок кредита: 2 года, ежемесячный платеж: " + monthlyPayment24 + ", процентная ставка: 9,99%.");
        System.out.println("Срок кредита: 3 года, ежемесячный платеж: " + monthlyPayment36 + ", процентная ставка: 9,99%.");
    
    }
}
