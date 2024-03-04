package static2;

public interface DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. static call");
        DecoData.staticCall();

        System.out.println("2. instance call1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. instance call2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

    }
}
