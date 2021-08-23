public class Main {
    public static void main(String[] args) {
        long startAmount = 100;
        long refillAmount = 1000;
        long totalAmount;
        if (refillAmount > 1000) {
            long bonus = refillAmount / 100;
            totalAmount = startAmount + refillAmount + bonus;
        } else {
            totalAmount = startAmount + refillAmount;
        }
        System.out.println(totalAmount);
    }
}

