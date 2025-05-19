package demo7;

public class ElectronicProduct extends Product {
    private int warrantyMonths;

    public ElectronicProduct(String productId, String name, double price, int warrantyMonths) {
        super(productId, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Warranty: " + warrantyMonths + " months";
    }

    public double calculateDiscountedPrice() {
        if (getPrice() > 10000000) {
            return getPrice() * 0.9; // giảm 10% // 0,9 = 100-90=10%
        }
        return getPrice();
    }
}
