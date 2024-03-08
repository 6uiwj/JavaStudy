package String;

public class Ex02 {
    public static void main(String[] args) {
        String str = new String();
        str = "안녕하세요";

        //format(String format, object... args) : 지정된 형식의 문자열 생성
        //ex01
        String format1 = String.format("Hello, %s %d", "world", 35);
        System.out.println(format1); //"Hello, world 35"

        //ex02
        String format2 = String.format("원주율: %.2f", Math.PI);
        System.out.println(format2); //3.14

        //hashCode() : 해시코드값 반환
        int hash = str.hashCode();
        System.out.println(hash);
    }
}
