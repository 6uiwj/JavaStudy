package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

        //기존 방법-----------------------------------------
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
        //기존 End ------------------------------

        System.out.println("------Stream Code------");
        // Stream -----------------------------
        List<String> customersNames = customers.stream()
                .filter(customer -> customer.getAge() > 30) //중간연산 - 조건 부여
                .sorted() //중간연산 - 정렬
                .map(Customer::getName) //중간연산 - 타입변환(Customer 객체를 Strimg 타입으로)
                .collect(Collectors.toList()); //최종연산 -컬렉션 List 형태로 반환

        for(String name : customersNames) {
            System.out.println(name);
        }
        // Stream End ---------------------------
    }
}
