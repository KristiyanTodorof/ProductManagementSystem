public class PerishableProduct extends Product implements Discountable,Comparable<PerishableProduct> {
    private int expirationDays;
    private double discountRate;
    double finalPrice;

    public PerishableProduct(int id, String name, double price, int expirationDays, double discountRate) {
        super(id, name, price);
        this.expirationDays = expirationDays;
        this.discountRate = discountRate;
    }

    public int getExpirationDays() {
        return expirationDays;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public double calculateDiscountablePrice() {
        finalPrice = getPrice() - (getPrice() * discountRate);
        return finalPrice;
    }

    @Override
    public String toString() {
        return "PerishableProduct{" +
                "Id= " + getId() +
                "Name= " + getName() +
                "Price= " + getPrice() +
                "Price with discount= " + calculateDiscountablePrice() +
                "expirationDays= " + expirationDays +
                "discountRate= " + discountRate +
                '}';
    }

    @Override
    public int compareTo(PerishableProduct product) {
        return Double.compare(this.calculateDiscountablePrice(), product.calculateDiscountablePrice());
    }
}
