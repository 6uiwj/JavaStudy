package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Filtering {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Kim", 33));
        customers.add(new Customer("Park", 21));
        customers.add(new Customer("Song", 45));
        customers.add(new Customer("Lee", 67));
        customers.add(new Customer("Choi", 19));
        customers.add(new Customer("Kim",33));

        //filter 사용 예시
        Stream<Customer> stream = customers.stream();
        stream.filter( customer -> customer.getAge() > 30 )
                .forEach(System.out::println);

        System.out.println("-----------------------");

        //distinct 사용 예시
        Stream<Customer> stream1 = customers.stream();
        stream1.filter( customer -> customer.getAge() > 30)
                .distinct()
                .forEach(System.out::println);
    }
}
