package collection;

import java.util.Stack;

// stack
public class Ex02 {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        //push(E e) : 끝에 요소를 추가
        names.push("이름1");
        names.push("이름2");
        names.push("이름3");

        //pop(): 끝에 요소를 꺼내기
        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.pop());
    }
}
