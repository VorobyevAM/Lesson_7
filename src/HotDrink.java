public enum HotDrink {
    LATTE("Латте", 150,1), MOKKO("Мокко", 170, 2), TEA("Чай", 50, 3);

    public String title;
    public int price;
    public int numberHotDrink;

    HotDrink(String title, int price, int numberHotDrink) {
        this.title = title;
        this.price = price;
        this.numberHotDrink = numberHotDrink;
    }
}
