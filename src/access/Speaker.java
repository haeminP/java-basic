package access;

public class Speaker {
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if (volume >= 100) {
            System.out.println("Maximum volume reached. Can't increase the volume.");
        }
        else {
            volume += 10;
            System.out.println("Increasing volume +10");
        }
    }

    void volumeDown(){
        volume -= 10;
        System.out.println("volumeDown called");
    }

    void showVolume(){
        System.out.println("Current volume: " + volume);
    }
}
