public class Main {
    public static void main(String[] args) {
        ProductItem laptop = new ProductItem("Laptop", 1000);
        ProductItem smartphone = new ProductItem("Smartphone", 800);

        PriceChangeObserver priceChangeObserver = new PriceChangeObserver();
        laptop.addObserver(priceChangeObserver);
        smartphone.addObserver(priceChangeObserver);

        laptop.setPrice(1200);
        smartphone.setPrice(900);
    }
}

