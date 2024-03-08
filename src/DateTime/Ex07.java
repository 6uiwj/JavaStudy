package DateTime;

import java.time.LocalDate;

public class Ex07 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = date1.plusWeeks(1);
        System.out.println("현재 날짜 : " + date1);
        System.out.println("상대 날짜 : " + date2);

        // <날짜비교> date2가 date1보다 뒤의 날짜인가?
        boolean comp = date2.isAfter(date1);
        System.out.println("date2가 date1 보다 뒤의 날짜인가? " + comp);

        // <날짜 차이 계산> date2-date1= ?
        int diff = date2.compareTo(date1);
        System.out.println("둘 사이의 날짜 차이는? " + diff);
    }
}
