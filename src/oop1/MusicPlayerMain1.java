package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // Turning on the player
        isOn = true;
        System.out.println("Music player is on now");

        // Increase volume
        volume++;
        System.out.println("Current volume: " + volume);

        // Increase volume
        volume++;
        System.out.println("Current volume: " + volume);

        // Decrease volume
        volume--;
        System.out.println("Current volume: " + volume);

        // Player status
        System.out.println("Current status: ");
        if (isOn){
            System.out.println("Player is ON, volume: " + volume);
        }

        else {
            System.out.println("Player is OFF, volume: " + volume);
        }

        // Turn off the player
        isOn = false;
        System.out.println("Player is off now.");


    }
}
