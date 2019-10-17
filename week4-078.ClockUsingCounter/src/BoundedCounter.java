
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
        int seconds = this.value;
    }

    public void reset() {
        this.value = 0;
    }

    public int getValue() {
        return this.value;
    }

    public void next() {
        if (this.value < this.upperLimit) {
            this.value++;
        } else {
            this.value = 0;
        }
    }

    @Override
    public String toString() {
        String theValue = Integer.toString(value);
        if (value < 10) {
            return "0" + theValue;
        }
        return theValue;
    }

    public void setValue(int x) {
        if (x < 0 || x > upperLimit) {

        } else {
            this.value = x;
        }
    }
}
