package task5.task1;

/**
 1. Создайте класс для и определите методы для предмета "Фонарь". У него будет название, определенное количество батареек, которые можно вставить,
 он должен уметь светить красным, белым светом, а также мигать, причем для белого света достаточно одной батарейки, для красного нужно 2,
 для мигающего нужно 3 (свойство int battery, которое будет хранить количество батареек для этого подойдет).
 Вы можете добавить возможности фонаря, как сочтете нужным.
 */
public class Task5_1Flashlight {
    String name = "FlashLight";
    String brand = "Philips";
    String model = "X1";
    String color = "black";
    String size = "medium";
    int power = 1;
    int battery;
    String mod;
    boolean shines;
    String warning;
    void SwitchON() {
        shines = true;

    }

    void SwitchOff() {
        shines = false;

    }

    int battery() {
        if (mod.equals("white")) {
            battery = 1;
        }
        if (mod.equals("red")) {
            battery = 2;
        }
        if (mod.equals("flash")) {
            battery = 3;
        }
        return battery;
    }

    void warning (int battery, String mod){
        if (battery < 1){
            warning = "Please insert battery";
            System.out.println(warning);
        }
        if (mod != "white" | mod != "red" | mod != "flash"){
            warning = "Please choose the right mod";
            System.out.println(warning);
        }
    }
}