package DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex04 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        DayOfWeek dayOfWeek = date1.getDayOfWeek();
        int yoil = dayOfWeek.getValue();
        System.out.println(yoil);

        String yoilStr1 = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.KOREAN);
        String yoilStr2 = dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.KOREAN);
        String yoilStr3 = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);

        System.out.printf("SHORT=%s, NARROW=%s, FULL=%s%n", yoilStr1, yoilStr2, yoilStr3);

        String yoilStr4 = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
        String yoilStr5 = dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.ENGLISH);
        String yoilStr6 = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        System.out.printf("SHORT=%s, NARROW=%s, FULL=%s%n", yoilStr4, yoilStr5, yoilStr6);
    }
}
