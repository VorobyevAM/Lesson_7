public class Main {

    public static void main(String[] args) {

        Bayer bayer = new Bayer();
        //bayer.setMoney();
        //bayer.getMoney();

        //VendingMachina vendingMachina = new VendingMachina(bayer.setMoney());
        //bayer.orderBayer();

        //bayer.getChoseOrder();

        //bayer.setDrink();
        VendingMachina showYouProducts = new VendingMachina();
        showYouProducts.getDrinks();
        VendingMachina zakaz1 = new VendingMachina(bayer.setMoney(),bayer.setNumberDrink());
        //System.out.println(vendingMachina.toString());
        zakaz1.orderProcessing();

        VendihgMachinForHotDrink showYouProductsHotDrink = new VendihgMachinForHotDrink();
        showYouProductsHotDrink.getDrinks();
        VendihgMachinForHotDrink zakaz2 = new VendihgMachinForHotDrink(bayer.setMoney(),bayer.setNumberDrink());
        zakaz2.orderProcessing();


    }
}
