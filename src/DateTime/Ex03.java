package DateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import static java.time.temporal.ChronoField.*;

public class Ex03 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        /*
        int year = date1.get(ChronoField.YEAR);
        int month = date1.get(ChronoField.MONTH_OF_YEAR);
        int date = date1.get(ChronoField.DAY_OF_MONTH);

         */
        //int year = date1.get(YEAR);
        int year = date1.getYear();
        //int month = date1.get(MONTH_OF_YEAR);
        int month = date1.getMonthValue();
        //int date = date1.get(DAY_OF_MONTH);
        int date = date1.getDayOfMonth();
        System.out.printf("year=%d, month=%d, date=%d%n", year,month,date);
    }
}
