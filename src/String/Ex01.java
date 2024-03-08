package String;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.stream.IntStream;

public class Ex01 {
    public static void main(String[] args) {
        String str = new String();
        str = "안녕하세요";
        String str2 = "반갑습니다";

        //charAt(int n) : n번째 index의 문자 반환 (0부터 시작)
        char result1 = str.charAt(1);
        System.out.println(result1); //"녕"반환

        //concat(String str): str문자를 원래 문자에 이어붙임
        String result2 = str.concat(str2);
        System.out.println(result2); //"안녕하세요반갑습니다"

        //contains(String str) : 특정문자 포함여부
        boolean contains = str.contains("아");
        System.out.println(contains); //false

        //endsWith(String suffix) : 특정 문자(열)로 끝나는지 확인
        boolean endsWith = str.endsWith("세요");
        System.out.println(endsWith); //true

        //equals(String str) : 특정 문자를 포함하는지
        boolean equals = str.equals(str2);
        System.out.println(equals); //false


        //indexOf(String str) : str 문자의 위치를 찾음
        String str3 = "나비야나비야";
        int indexOf = str3.indexOf("비");
        System.out.println(indexOf); // 1

        //indexOf(String str, int fromIndex) : fromIndex부터 str문자의 위치를 찾음
        int indexOf2 = str3.indexOf("비",3);
        System.out.println(indexOf2); //4

        //lastIndexOf(String str)
        int lastIndex = str3.lastIndexOf("비");
        System.out.println(lastIndex); //4

        //lastIndexOf(String str, int fromIndex) :
        // fromIndex부터 시작해서 앞쪽으로 해당 str의 첫번째 위치를 찾음
        str3 = "나비야나비야나비야";
        int lastIndex2 = str3.lastIndexOf("야",6);
        System.out.println(lastIndex2);




    }
}
