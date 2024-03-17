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

        /**
         * 삭제
         */
        //ArrayList는 수정, 추가됐을 때 기존 배열을 버리고 다시 생성함,
        //데이터 하나가 삭제되면 배열이 다시 생성되고, 배열 순서가 바뀜
        //따라서 아래와 같이 삭제를 했을 때 원하는 결과가 나오지 않음(231212 참고)
        /*
        for(int i = 0; i < names.size(); i++ ) {
            names.remove(i);
        }
         */

        //뒤에서부터 삭제해야 전부 삭제할 수 있다. = 스택 구조에 최적화
        for(int i = names.size() -1; i >= 0; i--) {
            String name = names.remove(i);
            System.out.println(name);
        }


        /**
         * 조회
         */
        //size(): list의 길이
        //get(): list 요소 가져오기
        for (int i = 0; i < names.size(); i++ ) {
            String name = names.get(i);
            System.out.println(name);
        }
    }
}
