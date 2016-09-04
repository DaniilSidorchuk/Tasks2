package task5.task1.task5.task2;


public class Task5_2TV {
    String name = "TV";
    String brand = "Samsung";
    String model = "JR1";
    String color = "black";
    String type;
    boolean play;
    String [] features = new String [50];

    int channels;
    int diagonal = 40;

    void SwitchOn(){
        play = true;
    }
    void SwitchOff(){
        play = false;
    }

    int channels(int channels, String type){
        if (type.equals("SmartTV")){
            channels = 1000;
        }
        if (type.equals("Simple")){
            channels = 200;
        }
        return channels;
    }
 String[] Features (String[] features, String type){
    if (type.equals("SmartTV")){
        features[0] = "Wi-Fi";
        features[1] = "Applications";
        features[2] = "Games";
        features[3] = "Video Recoding";
        features[4] = "Film library";
        features[5] = "Media Player";
        features[6] = "Web Camera";
        features[7] = "HDMI input";
        features[8] = "USB input";
        features[9] = "Auto Off";}
    if (type.equals("Simple")){
        features[0] = "HDMI input";
        features[1] = "Auto Off";
        }
     return features;
    }

}

