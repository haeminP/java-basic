package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("Turning the music player on");
    }

    void off(){
        isOn = false;
        System.out.println("Turning the music player off");
    }

    void volumeUp(){
        volume++;
        System.out.println("Current volume: " + volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("Current volume: " + volume);
    }

    void showStatus(){
        System.out.println("Current status: ");
        if (isOn) {
            System.out.println("Player is ON, volume: " + volume);
        }
        else {
            System.out.println("Player is OFF, volume: " + volume);
        }

    }
}
