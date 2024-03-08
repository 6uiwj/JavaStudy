package DateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Ex06 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        //LocalDate date2 = date1.plus(100, ChronoUnit.DAYS);
        LocalDate date2 = date1.plusDays(100);
        //LocalDate date3 = date2.minus(30,ChronoUnit.MONTHS);
        LocalDate date3 = date2.minusMonths(30);
        System.out.println(date1);
        System.out.printf("100일 후 : %s%n", date2);
        System.out.printf("30개월 전 : %s",date3);
    }
}
