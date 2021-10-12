import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateApi {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        int dd = dt.getDayOfMonth();
        int mm = dt.getMonthValue();
        int yy = dt.getYear();

//        System.out.printf("Date: %d-%d-%d",dd,mm,yy);

        int hr = dt.getHour();
        int min = dt.getMinute();
        int sec = dt.getSecond();
        int nan = dt.getNano();

        //System.out.printf("\nTime: %d:%d:%d:%d",hr,min,sec,nan);

        dt = LocalDateTime.of(2020,05,21,12,45);
        System.out.println(dt);
        System.out.println("After Six Months: "+dt.plusMonths(6));
        System.out.println("Before Six Months: "+dt.minusMonths(6));  
    }
}
