package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamAssist {
    public static void main(String[] args) {

        //Custormes 컬렉션에 임의의 5개 데이터 추가
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Song", 45));
        customers.add(new Customer("Kim", 33));
        customers.add(new Customer("Park", 21));
        customers.add(new Customer("Lee", 67));
        customers.add(new Customer("Choi", 19));


        //조건 1. 나이가 30 이상 사람
        //조건 2. 오름차순 정렬,
        //조건 3. 결과를 customer 객체가 아닌 문자열 데이터로 추출

        //기존 방법
        //조건 1
        List<Customer> list = new ArrayList<>();
        for (Customer customer : customers) {
            if(customer.getAge() > 30) {
                list.add(customer);
            }
        } //age 30> 추출

        //조건 2
        Collections.sort(list); //age에 대한 오름차순 정렬

        //조건 3
        List<String> results = new ArrayList<>();
        for(Customer customer : list ) {
            results.add(customer.getName());
        }

        //결과 출력
        for(String name : results) {
            System.out.println(name);
        }
    }
}
