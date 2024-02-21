package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);

    }


    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("Turning the music player on");
    }

    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("Turning the music player off");
    }

    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("Current volume: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("Current volume: " + data.volume);
    }

    static void showStatus(MusicPlayerData data){
        System.out.println("Current status: ");
        if (data.isOn) {
            System.out.println("Player is ON, volume: " + data.volume);
        }

        else {
            System.out.println("Player is OFF, volume: " + data.volume);
        }

    }
}
