package DateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex05 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
       // LocalDate date2 = date1.with(ChronoField.MONTH_OF_YEAR,12);
        LocalDate date2 = date1.withMonth(12);
        System.out.println(date1);
        System.out.println(date2);

    }
}
