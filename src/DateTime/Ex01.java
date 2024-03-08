package DateTime;

import java.util.Calendar;
import static java.util.Calendar.*;

import static java.util.Calendar.*;

public class Ex01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        printDate(cal);

        cal.set(DATE,20);
        printDate(cal);

        cal.add(DATE, 100); //100일 후
        printDate(cal);
        cal.add(DATE, -100); //100일 전
        printDate(cal);

        cal.roll(DATE, 100); //일(day)이 1~30사이에서 반복
        printDate(cal);
    }

    public static void printDate(Calendar cal) {
        //Calendar 클래스의 '월'은 0~11까지 출력되므로 +1을 해줘야 한다.
        String dateStr = String.format("%d-%d-%d", cal.get(YEAR), cal.get(MONTH)+1, cal.get(DAY_OF_MONTH));
        String timeStr = String.format("%d:%d:%d", cal.get(HOUR_OF_DAY), cal.get(MINUTE), cal.get(SECOND));

        System.out.println(dateStr + " " + timeStr);
    }
}
