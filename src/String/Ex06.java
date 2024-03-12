package String;

public class Ex06 {
    public static void main(String[] args) {
        String str = new String();
        str = "AbCdEfG";
        String str2= " 안 녕 하 세 요 ";

        //toLowerCase() : 주어진 문자열을 모두 소문자로 반환
        String toLowerCase = str.toLowerCase();
        System.out.println(toLowerCase);

        //toUpperCase() : 주어진 문자열을 모두 대문자로 반환
        String toUpperCase = str.toUpperCase();
        System.out.println(toUpperCase);


        //String.valueOf(A) : A의 데이터타입을 String으로 변환
        boolean ex1 = true;
        String result1 = String.valueOf(ex1);
        System.out.println(result1);


        //글자를 문자열로
        char ex2 = '글';
        String result2 = String.valueOf(ex2);
        System.out.println(result2);

        //글자 배열을 문자열로
        char[] ex3 = {'글','자','다'};
        String result3 = String.valueOf(ex3);
        System.out.println(result3);

        //글자 배열을 특정 index부터 특정 개수만큼 문자열로
        char[] ex4 = {'글','자','가','좀','많','다'};
        String result4 = String.valueOf(ex4,2,2);
        System.out.println(result4);

        //double형을 문자열로
        double ex5 = 3.1415926535897932;
        String result5 = String.valueOf(ex5);
        System.out.println(result5);


    }
}

