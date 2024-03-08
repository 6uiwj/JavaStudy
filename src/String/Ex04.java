package String;

import java.util.stream.Stream;

public class Ex04 {
    public static void main(String[] args) {
        String str = new String();
        str = "안녕하세요";

        //length() : 해당 문자열의 길이를 반환
        int length = str.length();
        System.out.println(length);

        //lines(): 해당 문자열을 스트림으로 변경
        Stream<String> ss = str.lines();

        //match(String str) : 해당 문자열이 str과 일치하는지 판단
        boolean match = str.matches("안녕하세요");
        System.out.println(match);

        //repeat(int n): 해당 문자열을 n번만큼 반복 출력
        String repeat = str.repeat(3);
        System.out.println(repeat);

        //replace(char a, char b): 문자열에 포함된 a문자를 b로 대체
        String str3 = "나비야 나비야 이리날아 오너라 호랑나비 흰나비";
        String replace = str3.replace("나비","넙치");
        System.out.println(replace);

        //replaceFirst(String a, String b) : 첫번째로 등장하는 a를 b로 대체
        String replaceFirst = str3.replaceFirst("나비","넙치");
        System.out.println(replaceFirst);

        //replaceAll(String "정규식", String "대체문자열") :
        String str4 = "123 - 456 - 789";
        String replaceAll = str4.replaceAll("\\d+", "X");
        System.out.println(replaceAll);



    }
}
