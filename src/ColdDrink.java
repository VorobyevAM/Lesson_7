public enum ColdDrink {
    COCA_COLA("Кока-кола", 80, 1), FANTA("Фанта", 75, 2), SPRITE("Спрайт", 70, 3);

    public String title;
    public int price;
    public int numberColdDrink;

    ColdDrink(String title, int price, int numberColdDrink) {
        this.title = title;
        this.price = price;
        this.numberColdDrink = numberColdDrink;
    }
}
