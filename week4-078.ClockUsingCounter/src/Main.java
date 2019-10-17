
import java.util.Scanner;

public class Main {

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

    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);

        BoundedCounter seconds = new BoundedCounter(60);
        BoundedCounter minutes = new BoundedCounter(60);
        BoundedCounter hours = new BoundedCounter(24);

        System.out.print("What is the current ");
        System.out.print("seconds: ");
        int sec = Integer.parseInt(reader.nextLine());
        System.out.print(" ,minutes: ");
        int min = Integer.parseInt(reader.nextLine());
        System.out.println(" ,hours: ");

        int hr = Integer.parseInt(reader.nextLine());
        seconds.setValue(sec);
        minutes.setValue(min);

        hours.setValue(hr);

       

        System.out.println(getTheValue(hours, minutes, seconds));
        while (true) {

            seconds.next();
            if (seconds.getValue() == 60) {

                minutes.next();
                if (minutes.getValue() > 59) {
                    hours.next();
                    minutes.reset();
                }
                if (hours.getValue() > 23) {
                    hours.reset();
                }
               

            } else if (seconds.getValue() < 60) {
                System.out.println(getTheValue(hours, minutes, seconds));
                Thread.sleep(1000);
                
            }
        }
    }
}
// write here code to ensure that BoundedCounter works as expected
// before starting 78.3 remove the extra code and use the skeleton shown
// in the assignment

