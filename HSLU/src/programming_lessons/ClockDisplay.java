package programming_lessons;

public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;

    // Change testing Time in ticks, to see if the clocks works
    private int TESTINGTIME = 100;


    // constants that can be changed:
    private int LIMIT_MINUTES = 60;
    private int LIMIT_HOURS = 24;
    private int TICKSPEED = 1; // 1000 => 1second


    public static void main(String[] args) {
        new ClockDisplay();
    }

    public ClockDisplay() {
        this.hours = new NumberDisplay(LIMIT_HOURS);
        this.minutes = new NumberDisplay(LIMIT_MINUTES);
        testing();
    }

    public ClockDisplay(int hours, int minutes) {
        this.hours = new NumberDisplay(LIMIT_HOURS);
        this.minutes = new NumberDisplay(LIMIT_MINUTES);
        setTime(hours,minutes);
        testing();
    }

    public ClockDisplay(int hours, int minutes, int limitHour) {
        if(limitHour < 0){
            limitHour = LIMIT_HOURS;
        }
        this.hours = new NumberDisplay(limitHour);
        this.minutes = new NumberDisplay(LIMIT_MINUTES);
        setTime(hours,minutes);
        testing();
    }

    public String getTime(){
        return hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

    public void setTime(int hour, int minute){
        hours.setValue(hour);
        minutes.setValue(minute);
    }

    public void timeTick(){
        try {
            Thread.sleep(TICKSPEED); // Pauses for 1 second (1000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (minutes.getValue() == minutes.getLimit()-1) {
            hours.increment();
        }
        minutes.increment();
    }

    public void testing(){
    // Test it:
    for(int i = 0; i < TESTINGTIME ; i++){
        System.out.println(getTime());
        timeTick();
    }
    }
}