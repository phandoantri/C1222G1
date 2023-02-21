package ss4_lop_va_doi_tuong.bai_tap.StopWatch;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

public class StopWatch {
    private long startTime,endTime;
    public StopWatch(){
        this.startTime=System.currentTimeMillis();
    }
    public void start(){
        this.startTime= System.currentTimeMillis();
    }
    public void end(){
        this.endTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime-startTime;
    }

}
