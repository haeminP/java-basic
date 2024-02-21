package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // Turning on the player
        data.isOn = true;
        System.out.println("Music player is on now");

        // Increase volume
        data.volume++;
        System.out.println("Current volume: " + data.volume);

        // Increase volume
        data.volume++;
        System.out.println("Current volume: " + data.volume);

        // Decrease volume
        data.volume--;
        System.out.println("Current volume: " + data.volume);

        // Player status
        System.out.println("Current status: ");
        if (data.isOn) {
            System.out.println("Player is ON, volume: " + data.volume);
        }

        else {
            System.out.println("Player is OFF, volume: " + data.volume);
        }

        // Turn off the player
        data.isOn = false;
        System.out.println("Player is off now.");


    }
}
