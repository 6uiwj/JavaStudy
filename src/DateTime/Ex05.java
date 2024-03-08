package DateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex05 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
       // LocalDate date2 = date1.with(ChronoField.MONTH_OF_YEAR,12);
        //현재 날짜를 지정하는 값으로 변경
        LocalDate date2 = date1.withYear(2020);
        LocalDate date3 = date1.withMonth(12);
        LocalDate date4 = date1.withDayOfMonth(17);

        System.out.println("현재 날짜 : " + date1);
        System.out.println("연도 변경 날짜 : " + date2);
        System.out.println("월 변경 날짜 : " + date3);
        System.out.println("일 변경 날짜 : " + date4);



    }
}
