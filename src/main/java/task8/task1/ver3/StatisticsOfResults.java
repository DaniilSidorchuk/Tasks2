package task8.task1.ver3;

import java.util.ArrayList;

public class StatisticsOfResults {

    private static ArrayList<WinnerAndLoser> list = new ArrayList<>();

    public static void addStatistics(WinnerAndLoser win){
        boolean isSame = false;

        for (int i = 0; i < list.size() ; i++) {
        if (list.get(i).getName().equals(win.getName()) && list.get(i).getAge()==win.getAge()){
            list.get(i).setWins(list.get(i).getWins()+win.getWins());
            list.get(i).setLoses(list.get(i).getLoses()+win.getLoses());
            isSame = true;
            break;
        }}
        if (!isSame && !list.isEmpty())list.add(win);
        if (list.isEmpty())list.add(win);
        }


    public static void printStatistics(){

        for (int i = 0; i < list.size() ; i++) {
            System.out.println("Player " + list.get(i).getName() + " " + list.get(i).getAge() + " years" + " has "+  list.get(i).getWins() + " wins & " + list.get(i).getLoses() + " loses");
        }
    }


    }



