package String;

public class Ex07 {
    public static void main(String[] args) {
        /**
         * trim() VS strip()
         *
         * ##trim()
         * 스페이스 (space, ASCII 값 32),
         * 탭 (tab, ASCII 값 9),
         * 개행 (line feed, ASCII 값 10),
         * 캐리지 리턴 (carriage return, ASCII 값 13)
         * 등의 ASCII 공백 문자만을 제거
         *
         * ##strip() - JAVA 11 이상
         * Character.isWhitespace() 메서드가 true를 반환하는
         * 모든 공백 문자를 제거
         */
        //strip() : 문자의 앞, 뒤 공백을 제거
        String str1 = "   안 녕 하 세 요 . !    ";
        String strip = str1.strip();
        System.out.println(strip);

        //trim() : 문자의 앞, 뒤 공백을 제거
        String trim = str1.trim();
        System.out.println(trim);


    }
}
