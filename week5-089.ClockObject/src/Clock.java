public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(24);
        this.minutes = new BoundedCounter(60);
        this.seconds = new BoundedCounter(60);
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
        
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
    }
    
    public void tick() {
        
            this.seconds.next();
        
        if(this.seconds.getValue() == 60){
            this.seconds.reset();
            this.minutes.next();
        }
        if(this.minutes.getValue() == 60){
            this.minutes.reset();
            this.hours.next();
        }
        if(this.hours.getValue() == 24){
            this.hours.reset();
            
        }
        // Clock advances by one second
        }
        
    
    
    public String toString() {
        // returns the string representation
        return this.hours+":"+this.minutes+":"+this.seconds;
    }
}
