package access;

public class MaxCounter {

    private int count = 0;
    private int max;
    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        // verification logic
        if (count >= max) {
            System.out.println("Max reached. Can't increment the count");
            return;
        }
        // execution logic
        count++;
    }

    public int getCount() {
        return count;
    }

}
