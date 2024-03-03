package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.volumeUp();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeDown();
        speaker.showVolume();

        // Accessing the volume field directly
//        System.out.println("Changing the volume field by directly accessing it");
//        speaker.volume = 200;
        speaker.showVolume();
    }
}
