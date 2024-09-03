package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Kim", 33));
        customers.add(new Customer("Park", 21));
        customers.add(new Customer("Song", 45));
        customers.add(new Customer("Lee", 67));
        customers.add(new Customer("Choi", 19));


        //나이를 기준으로 오름차순 정렬됨
        customers.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("---------------------");

        //비교할 조건 직접 정해서 정렬
//        customrs.stream()
//                .sorted(Comparator.comparing(Customer::getName))
//                .forEach(System.out::println);
//    }
}}
