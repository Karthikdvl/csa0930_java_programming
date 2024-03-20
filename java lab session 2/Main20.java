class Money {
    private long dollars;
    private long cents;

    public Money(double amount) {
        if (amount < 0) {
            System.out.println("Error: Negative amounts of money are not allowed.");
            System.exit(0);
        } else {
            long allCents = Math.round(amount * 100);
            dollars = allCents / 100;
            cents = allCents % 100;
        }
    }

    // Override toString() to display money in the format "dollars.cents"
    @Override
    public String toString() {
        return String.format("%d.%02d", dollars, cents);
    }

    // Override equals() to compare dollars and cents
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Money) {
            Money other = (Money) obj;
            return this.dollars == other.dollars && this.cents == other.cents;
        }
        return false;
    }
}

public class Main20 {
    public static void main(String[] args) {
        Money firstAmount = new Money(10.02);
        Money secondAmount = new Money(10.02);
        Money thirdAmount = new Money(10.88);

        System.out.println("First amount: " + firstAmount);
        System.out.println("Second amount: " + secondAmount);
        System.out.println("Third amount: " + thirdAmount);

        boolean equal1 = secondAmount.equals(firstAmount);
        if (equal1)
            System.out.println(secondAmount + " equals " + firstAmount);
        else
            System.out.println(secondAmount + " does not equal " + firstAmount);

        boolean equal2 = thirdAmount.equals(firstAmount);
        if (equal2)
            System.out.println(thirdAmount + " equals " + firstAmount);
        else
            System.out.println(thirdAmount + " does not equal " + firstAmount);
    }
}
