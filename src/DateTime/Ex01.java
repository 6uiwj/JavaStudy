package DateTime;

import java.util.Calendar;
import static java.util.Calendar.*;

import static java.util.Calendar.*;

public class Ex01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.print("현재날짜 : ");
        printDate(cal);


        cal.add(DATE, 100); //100일 후
        System.out.print("100일 후 날짜 : ");
        printDate(cal);


        cal.add(DATE, -100); //100일 전
        System.out.print("100일 전 날짜 : ");
        printDate(cal);

    }

    /**
     * 편의를 위해 년/월/일/시간만 출력되도록 메서드 구현
     * @param cal
     */
    public static void printDate(Calendar cal) {
        //Calendar 클래스의 '월'은 0~11까지 출력되므로 +1을 해줘야 한다.
        String dateStr = String.format("%d-%d-%d", cal.get(YEAR), cal.get(MONTH)+1, cal.get(DAY_OF_MONTH));
        String timeStr = String.format("%d:%d:%d", cal.get(HOUR_OF_DAY), cal.get(MINUTE), cal.get(SECOND));

        System.out.println(dateStr + " " + timeStr);
    }
}
