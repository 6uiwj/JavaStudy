package collection;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        //add() 배열에 등록?
        names.add("이름2");
        names.add("이름1");
        names.add("이름3");
        names.add("이름5");
        names.add("이름4");

        //System.out.println(names);

        //size(): list의 길이
        //get(): list 요소 가져오기
        for (int i = 0; i < names.size(); i++ ) {
            String name = names.get(i);
            System.out.println(name);
        }
    }
}
