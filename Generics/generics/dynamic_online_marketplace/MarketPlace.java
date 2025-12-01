package dynamic_online_marketplace;

class MarketPlace {
    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        product.setPrice(product.getPrice() * (1 - percent/100));
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Book", 500);
        applyDiscount(book, 10);
        System.out.println(book);
    }
}
