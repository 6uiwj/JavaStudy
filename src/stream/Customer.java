package stream;

public class Customer implements Comparable<Customer> {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[Name : " + name + ", Age : " + age + "]";
    }

    /**
     * 비교를 위한 메서드
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if ( this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return name.equals(customer.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public int compareTo(Customer customer) {
        if(this.age > customer.getAge()) {
            return 1;
        } else if( this.age == customer.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }
}