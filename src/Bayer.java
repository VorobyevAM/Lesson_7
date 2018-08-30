import java.util.Scanner;

public class Bayer {

    private int money;
    private String [] choseOrder;
    private int numberDrink;


    public int setMoney() {
        System.out.println("Внесите деньги: ");
        Scanner scanner = new Scanner(System.in);
        this.money = scanner.nextInt();
        if (this.money>0){
            System.out.println("Внесенныая сумма: " + this.money);
        }else{
            System.out.println("За бесплатно аппарат не работает!");
        }
        return this.money;
    }

    public int setNumberDrink() {
        System.out.println("Укажте номер напитка: ");

        Scanner scanner = new Scanner(System.in);

        return this.numberDrink = scanner.nextInt();
    }

}
