public class NonPerishableProduct extends Product implements Discountable, Comparable<NonPerishableProduct> {
    private int warrantyYears;

    public int getWarrantyYears() {
        return warrantyYears;
    }

    public NonPerishableProduct(int id, String name, double price, int warrantyYears) {
        super(id, name, price);
        this.warrantyYears = warrantyYears;
    }


    @Override
    public String toString() {
        return "NonPerishableProduct{" +
                "warrantyYears= " + warrantyYears +
                "Id= " + getId() +
                "Name= " + getName() +
                "Price= " + getPrice() +
                "Price with discount= " + calculateDiscountablePrice() +
                '}';
    }

    @Override
    public double calculateDiscountablePrice() {
        return getPrice();
    }


    @Override
    public int compareTo(NonPerishableProduct product) {
        return Double.compare(this.calculateDiscountablePrice(),product.calculateDiscountablePrice());
    }
}
