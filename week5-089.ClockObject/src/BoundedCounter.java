

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
        if (x < 0 || x > this.upperLimit) {

        } else {
            this.value = x;
        }
    }
      public static String getTheValue(BoundedCounter hours, BoundedCounter minutes, BoundedCounter seconds) {
       
        if (minutes.getValue() < 10 && seconds.getValue() < 10 && hours.getValue() < 10) {
            return "0" + hours.getValue() + ":" + "0" + minutes.getValue() + ":" + "0" + seconds.getValue();
        } else if (hours.getValue() < 10 && minutes.getValue() < 10 && seconds.getValue() >= 10) {
            return "0" + hours.getValue() + ":" + "0" + minutes.getValue() + ":" + seconds.getValue();
        } else if (hours.getValue() < 10 && minutes.getValue() >= 10 && seconds.getValue() >= 10) {
            return "0" + hours.getValue() + ":" + minutes.getValue() + ":" + seconds.getValue();
        } else if (hours.getValue() < 10 && minutes.getValue() >= 10 && seconds.getValue() < 10) {
            return "0" + hours.getValue() + ":" + minutes.getValue() + ":" + "0" + seconds.getValue();
        } else if (hours.getValue() >= 10 && minutes.getValue() >= 10 && seconds.getValue() < 10) {
            return hours.getValue() + ":" + minutes.getValue() + ":" + "0" + seconds.getValue();
        } else {
            return hours.getValue() + ":" + minutes.getValue() + ":" + seconds.getValue();
        }
       
    }
      public static void clockOn(){
          
      }
}

