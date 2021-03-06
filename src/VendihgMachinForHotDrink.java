import java.util.Scanner;

public class VendihgMachinForHotDrink extends VendingMachina {

    private String [] drinks = new String[]{"Кофе","Какао","Чай"};
    private int [] drinksCost = new int[]{150,170,50};
    private int [] drinkNumber = new int[]{1,2,3};

    private int deposit;

    private int chooseBayerDrink;
    private int backMoney;

    public VendihgMachinForHotDrink(int deposit, int chooseBayerDrink) {
        this.deposit = deposit;
        this.chooseBayerDrink = chooseBayerDrink;
    }

    public VendihgMachinForHotDrink() {
    }

    @Override
    public String toString() {//Переделат на ваш заказ и убрать сумму
        return "Ваш заказ:  VendingMachina{" +
                "deposit=" + deposit +
                ", chooseDayerDrink='" + chooseBayerDrink + '\'' +
                '}';
    }
    @Override
    public String[] getDrinks() {
        System.out.println("Номер 1: " + drinks[0] + "\nНомер 2: " + drinks[1] + "\nНомер 3: " + drinks[2]);
        return drinks;
    }
    @Override
    public void orderProcessing(){//Обработка заказа
        if (chooseBayerDrink==drinkNumber[0]){

            if (deposit>=drinksCost[0]){
                backMoney=deposit-drinksCost[0];
                System.out.println("Плучите ваш напиток " + drinks[0] + ". И заберите сдачу: " + backMoney);
            }else{
                do {
                    setDeposit();
                }while (deposit<drinksCost[0]);
                backMoney=deposit-drinksCost[0];
                System.out.println("Плучите ваш напиток " + drinks[0] + ". И заберите сдачу: " + backMoney);
            }
        }else if(chooseBayerDrink==drinkNumber[1]){

            if (deposit>=drinksCost[1]){
                backMoney=deposit-drinksCost[1];
                System.out.println("Плучите ваш напиток " + drinks[1] + ". И заберите сдачу: " + backMoney);
            }else{
                do {
                    setDeposit();
                }while (deposit<drinksCost[1]);
                backMoney=deposit-drinksCost[1];
                System.out.println("Плучите ваш напиток " + drinks[1] + ". И заберите сдачу: " + backMoney);
            }

        }else if(chooseBayerDrink==drinkNumber[2]){

            if (deposit>=drinksCost[2]){
                backMoney=deposit-drinksCost[2];
                System.out.println("Плучите ваш напиток " + drinks[2] + ". И заберите сдачу: " + backMoney);
            }else{
                do {
                    setDeposit();
                }while (deposit<drinksCost[2]);
                backMoney=deposit-drinksCost[2];
                System.out.println("Плучите ваш напиток " + drinks[2] + ". И заберите сдачу: " + backMoney);
            }

        }else{
            System.out.println("Напитка с таким номером нет. Заберите ваши деньги.");
            backMoney=deposit;
        }

    }
    @Override

    public void setDeposit() {
        System.out.println("Недостаточно средств внесите еще: ");
        Scanner scanner = new Scanner(System.in);
        this.deposit = deposit + scanner.nextInt();
    }
}
