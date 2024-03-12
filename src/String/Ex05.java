package String;

public class Ex05 {
    public static void main(String[] args) {
        String str = new String();
        str = "안녕하세요";
        String str4 = "123 - 456 - 789";

        //split(String a) : a 문자를 기준으로 문자열을 짤라 배열에 넣음
        String[] split = str4.split("-");
        for(String temp : split) {
            System.out.println(temp);
        }

        //split(String a(분할기준), String b(최대 분할 수))
        //a 문자를 기준으로 최대 b개 만큼 문자열이 분할 됨
        String[] split2 = str4.split("-",2);
        for(String temp : split2) {
            System.out.println(temp);
        }

        //subSequence(int a, int b): [a,b)까지 일부문자열 출력
       String subS = str.substring(1,3);
        System.out.println(subS);

        String subS2 = str.substring(2);
        System.out.println(subS2);

        //toCharArray() : 주어진 문자열을 글자배열로 반환
        char[] toChar = str.toCharArray();
        System.out.println("toCharArray : " + toChar);


    }
}
