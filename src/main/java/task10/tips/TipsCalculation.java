package task10.tips;

import java.util.Scanner;


public class TipsCalculation {

    static Tips [] tips = {new TerribleService(), new PoorService(), new GoodService(), new GoodService(), new ExcellentService()};

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);


        System.out.println("Please type amount of your bill");
        int amount = scanner1.nextInt();
        System.out.println("Please enter your opinion about service using standard gradation (terrible; poor; good; great; excellent");
        String service = scanner2.nextLine();

    double tipsAmount = calculation(service, amount);

        System.out.println("In according to your mark for the service you should leave for the waiter next amount: " + tipsAmount);

    }

    private static double calculation (String service, int amount){
        double tipsAmount = -1;

        if (service.equals("terrible")) {
                tipsAmount = tips[0].tipsAmount(amount);

        }
        if (service.equals("poor")) {
                tipsAmount = tips[1].tipsAmount(amount);
            }
        if (service.equals("good")){
                tipsAmount = tips[2].tipsAmount(amount);
            }
        if (service.equals("great")){
                tipsAmount = tips[3].tipsAmount(amount);
            }
        if (service.equals("excellent")){
                tipsAmount = tips[4].tipsAmount(amount);
            }
if (tipsAmount == -1){
    System.out.println("Please choose mark for service from provided graduation");
}

    return tipsAmount;

    }
}
