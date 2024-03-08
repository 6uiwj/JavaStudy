package DateTime;

import java.util.Calendar;
import java.util.Date;

public class Ex01_01 {
    public static void main(String[] args) {

        //현재 날짜 및 시간 가져오기
        Calendar calendar = Calendar.getInstance();
        System.out.println("출력값1 : "+calendar);

        System.out.println("---------------------------------");

        //현재 객체에 저장된 년/월/일/요일/시간을 Date 타입으로 반환
        Date temp = calendar.getTime();
        System.out.println("출력값2 : " + temp);

        //반환된 결과를 문자열로 변경
        temp.toString();
        boolean temp3 = temp.toString() instanceof String;
        System.out.println("temp3는 String 타입인가? " + temp3);


        calendar.set(Calendar.DATE,20); //현재 달의 일을 20일로 설정
        System.out.println("calendar.set(Calendar.DATE,20) 결과값 : " + calendar.getTime());

        calendar.set(Calendar.YEAR,2020);
        System.out.println("calendar.set(Calendar.YEAR,2020) 결과값 : " +calendar.getTime());
        /**
         * calendar 클래스에서는 0이 1월을 나타낸다.
         * 따라서 1~12월은 0~11에 대응된다.
         */
        calendar.set(2024,5,15);
        System.out.println("calendar.set(2024,5,15) 결과값 : "+calendar.getTime());

    }
}
