package String;

public class Ex03 {
    public static void main(String[] args) {
        String str = new String();
        str = "안녕하세요";

        //isBlank() : 해당 문자열이 비어있거나 공백인지 확인(null X)
        boolean isBlank = str.isBlank();
        boolean isBlank2 = (" ").isBlank();
        boolean isBlank3 = ("").isBlank();
        System.out.println(isBlank); //false
        System.out.println(isBlank2); //true
        System.out.println(isBlank3); //true

        //isEmpty() : 해당 문자열이 비어있는지 확인(null X)
        boolean isEmpty = (" ").isEmpty();
        boolean isEmpty2 = ("").isEmpty();
        System.out.println(isEmpty); //false
        System.out.println(isEmpty2); //true
    }
}
