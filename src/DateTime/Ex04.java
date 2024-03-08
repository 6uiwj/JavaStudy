package DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex04 {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();
        DayOfWeek dayOfWeek = date1.getDayOfWeek();
        System.out.println("현재 요일 반환 : " + dayOfWeek);

        int yoil = dayOfWeek.getValue();
        System.out.println("현재 요일을 숫자로 반환 : " + yoil);

        //요일을 문자 길이별로 한글로 출력
        String yoilStr1 = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.KOREAN);
        String yoilStr2 = dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.KOREAN);
        String yoilStr3 = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);

        System.out.printf("SHORT=%s, NARROW=%s, FULL=%s%n", yoilStr1, yoilStr2, yoilStr3);

        //요일을 문자 길이별로 영어로 출력
        String yoilStr4 = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
        String yoilStr5 = dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.ENGLISH);
        String yoilStr6 = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        System.out.printf("SHORT=%s, NARROW=%s, FULL=%s%n", yoilStr4, yoilStr5, yoilStr6);
    }
}
