public class SecondsOfTheYear {

    public static void main(String[] args) {   
        // In below an incomplete version of the program. Please complete it!
        
        int daysInYear = 365;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60;
        int hourInYear = daysInYear * hoursInDay;
        int minutesInYear = minutesInHour*hourInYear;
        int secondsInYear = secondsInMinute*minutesInYear;

        System.out.println("There are " + secondsInYear + " seconds in a year");
    }

}
