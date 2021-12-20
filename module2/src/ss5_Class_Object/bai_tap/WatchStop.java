package ss5_Class_Object.bai_tap;

import java.time.LocalTime;

public class WatchStop {
    private LocalTime startTime, endTime;

    public WatchStop() {

    }

    public WatchStop(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void start(){

        startTime = LocalTime.now();
    }

    public void stop(){

        endTime = LocalTime.now();
    }

    public int getElapsedTime(){
        int miliSecond = ((this.endTime.getHour()-this.startTime.getHour())*3600 + (this.endTime.getMinute()-this.startTime.getMinute())*60 + (this.endTime.getSecond()-this.startTime.getSecond())*1000);
        return miliSecond;
    }

}
