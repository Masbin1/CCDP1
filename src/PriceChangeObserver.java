class PriceChangeObserver implements Observer {
    @Override
    public void update(ProductItem product) {
        System.out.println("Price of " + product.getProductName() + " changed to " + product.getPrice());
    }
}
