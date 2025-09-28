class BaseProduct {
    protected String name;
    protected double base_price;

    public BaseProduct(String name, double base_price) {
        this.name = name;
        this.base_price = base_price;
    }

    public double getNetPrice() {
        return base_price;
    }

    public void setPrice(double price) {
        this.base_price = price;
    }

    public void print() {
        System.out.println("Product: " + name);
        System.out.println(" Base Price: " + base_price);
    }
}

class ImportedProduct extends BaseProduct {
    private double importDuty;

    public ImportedProduct(String name, double base_price, double importDuty) {
        super(name, base_price);
        this.importDuty = importDuty;
    }

    public void setImportDuty(double importDuty) {
        this.importDuty = importDuty;
    }

    @Override
    public double getNetPrice() {
        return base_price + importDuty;
    }
}

class DiscountedProduct extends BaseProduct {
    private double discountRate;

    public DiscountedProduct(String name, double base_price, double discountRate) {
        super(name, base_price);
        this.discountRate = discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double getNetPrice() {
        return base_price - (base_price * discountRate / 100);
    }
}

class TestProducts {
    public static void main(String[] args) {
        BaseProduct bp = new ImportedProduct("Laptop", 50000, 5000); 
        bp.print();
        System.out.println("Net Price: " + bp.getNetPrice());

        if (bp instanceof ImportedProduct) {
            ImportedProduct ip = (ImportedProduct) bp;
            ip.setImportDuty(6000);
            System.out.println("Updated Net Price: " + ip.getNetPrice());
        }

        BaseProduct bp2 = new DiscountedProduct("Phone", 30000, 10); 
        bp2.print();
        System.out.println("Net Price: " + bp2.getNetPrice());

        if (bp2 instanceof DiscountedProduct) {
            DiscountedProduct dp = (DiscountedProduct) bp2;
            dp.setDiscountRate(20);
            System.out.println("Updated Net Price: " + dp.getNetPrice());
        }
    }
}
