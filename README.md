## 목차

<br>

[1.java.time 패키지](#1-java.time)

[2.Java.lang.String 패키지](#2String)

[3.Stream API](#3Stream)


<hr>

## 1. java.time
<br>
날짜와 시간에 관련된 패키지로는 Date, Calendar, time, LocalDate(Time) 패키지 등이 있다.
Java.util.Date 패키지는 JDK1.0에서 쓰이던 패키지인데, 기능 부족 문제로 대부분 JDK1.1부터 Calendar 패키지로 교체되었다.
하지만 Java.util.Calendar 패키지 역시 기능이 충분치 않았기 때문에, 몇 가지 기능이 보완, 개선된 java.time 패키지가 추가되었다. 
<br>
<br>

### 1-1. java.util.Calendar
<br>
> 주요 메서드들 
 
<br>
지금은 잘 사용되지 않는 패키지이므로 몇 가지 주요 메서드만 알아보자.



|메서드|반환값|설명|
|:----|:---:|:---:|
|getInstance()|static Calendar|현재날짜의 연/월/일/시간/지역 등의 모든 정보 출력 |
|getTime()|final Date|현재 날짜의 표준시/년/월/일/시간 출력|
|set(int field, int value)|void|set(연도/월/시/분/초 등 , 바꿀 값 )|
|set(int year, int month, int date)|final void|년/월/일 직접 설정|
|add(int field, int amount)|abstract void|현재날짜(혹은 지정한 날짜)의 field에 amount만큼 값을 더함)|

<br>

----------------------------------------------

### - getInstance()
  현재 시간에 관련된 정보를 전부 반환한다.
  <br>
 ```java
public class Ex01_01 {
    public static void main(String[] args) {

Calendar calendar = Calendar.getInstance();
System.out.println("출력값1 : "+calendar);

    }
}
```
<br>
calendar 객체의 반환값은 다음과 같이 많은 정보를 담고 있다.

![image](https://github.com/6uiwj/JavaStudy/assets/148047079/f2626811-0497-408f-8427-f0f4c01e92ec)
<br>

우리가 원하는 날짜와 시간 정보만 출력하려면 getTime() 메서드를 이용하자. (반환값은 Date이다.)
```java
public class Ex01_01 {
    public static void main(String[] args) {

        //현재 날짜 및 시간 가져오기
        Calendar calendar = Calendar.getInstance();
        //System.out.println("출력값1 : "+calendar);


        //현재 객체에 저장된 년/월/일/요일/시간을 Date 타입으로 반환
        Date temp = calendar.getTime();
        System.out.println("출력값2 : " + temp);
```
```
출력값2 : Fri Mar 08 17:15:01 KST 2024
```

<br>

---------------------------------------

### - set()

  시간을 직접 설정할 수 있는 메서드이다.
  Exam 01, 02 처럼 원하는 필드의 값만 바꿀 수도 있고,
  Exam 03 처럼 전채 년/월/일/시간을 바꿀 수도 있다.
```java
public class Ex01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        //Exam 01
        calendar.set(DATE,20); //현재 달의 일을 20일로 설정
        System.out.println("set메서드 실행 결과값 : " + calendar.set(Date,20));

        //Exam 02
        calendar.set(Calendar.YEAR,2020); //현재 연도를 2020년으로 설정
        System.out.println("set메서드 실행 결과값 2 : " +calendar);

        //Exam 03
        /**
         * calendar 클래스에서는 0이 1월을 나타낸다.
         * 따라서 1~12월은 0~11에 대응된다.
         */
        calendar.set(2024,5,15);
        System.out.println("set메서드 실행 결과값3 : "+calendar.getTime());
    }
}
```
```
calendar.set(Calendar.DATE,20) 결과값 : Wed Mar 20 17:43:37 KST 2024
calendar.set(Calendar.YEAR,2020) 결과값 : Fri Mar 20 17:43:37 KST 2020
calendar.set(2024,5,15) 결과값 : Sat Jun 15 17:43:37 KST 2024
```

<br>

---------------------------------------  

### - add()
현재 날짜 혹은 지정된 날짜에서 특정 일수를 더하거나 뺄 수 있다.


```java
 package DateTime;

public class Ex01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.print("현재날짜 : ");
        printDate(cal);


        cal.add(DATE, 100); //100일 후
        System.out.print("100일 후 날짜 : ");
        printDate(cal);


        cal.add(DATE, -100); //100일 전
        System.out.print("100일 전 날짜 : ");
        printDate(cal);

    }

   /**
     * 편의를 위해 년/월/일/시간만 출력되도록 메서드 구현
     * @param cal
     */
    public static void printDate(Calendar cal) {
        //Calendar 클래스의 '월'은 0~11까지 출력되므로 +1을 해줘야 한다.
        String dateStr = String.format("%d-%d-%d", cal.get(YEAR), cal.get(MONTH)+1, cal.get(DAY_OF_MONTH));
        String timeStr = String.format("%d:%d:%d", cal.get(HOUR_OF_DAY), cal.get(MINUTE), cal.get(SECOND));

        System.out.println(dateStr + " " + timeStr);
    }
}

```
```
현재날짜 : 2024-3-8 17:25:13
100일 후 날짜 : 2024-6-16 17:25:13
100일 전 날짜 : 2024-3-8 17:25:13
```
---------------------------------------
### 1-2. java.time.LocalDate

1. 현재날짜 출력, 날짜 지정하기


```java

public class Ex02 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now(); //현재시간 출력
        System.out.println(date1);

        //지정된 시간 출력
        LocalDate date2 = LocalDate.of(2022,10,4);
        System.out.println(date2);

    }
}

```
```
2024-03-08
2022-10-04
```

2. 현재날짜 혹은 특정 날짜의 년/월/일 출력하기

```java
public class Ex03 {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();

        int year = date1.getYear();
        int month = date1.getMonthValue();
        int date = date1.getDayOfMonth();

        System.out.printf("year=%d, month=%d, date=%d%n", year,month,date);
    }
}

```
```
year=2024, month=3, date=8
```

<hr>

3. 요일 관련 메서드
```java

public class Ex04 {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();
        DayOfWeek dayOfWeek = date1.getDayOfWeek();
        System.out.println("현재 요일 반환 : " + dayOfWeek);

        int yoil = dayOfWeek.getValue();
        System.out.println("현재 요일을 숫자로 반환 : " + yoil);

        //요일을 문자 길이별로 한글로 출력
        String yoilStr1 = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.KOREAN);
        String yoilStr2 = dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.KOREAN);
        String yoilStr3 = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);

        System.out.printf("SHORT=%s, NARROW=%s, FULL=%s%n", yoilStr1, yoilStr2, yoilStr3);

        //요일을 문자 길이별로 영어로 출력
        String yoilStr4 = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
        String yoilStr5 = dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.ENGLISH);
        String yoilStr6 = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        System.out.printf("SHORT=%s, NARROW=%s, FULL=%s%n", yoilStr4, yoilStr5, yoilStr6);
    }
}

   ```
```
현재 요일 반환 : FRIDAY
현재 요일을 숫자로 반환 : 5
SHORT=금, NARROW=금, FULL=금요일
SHORT=Fri, NARROW=F, FULL=Friday
```

4. 날짜 변경 관련 메서드

```java

public class Ex05 {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();

        //현재 날짜를 지정하는 값으로 변경
        LocalDate date2 = date1.withYear(2020);
        LocalDate date3 = date1.withMonth(12);
        LocalDate date4 = date1.withDayOfMonth(17);

        System.out.println("현재 날짜 : " + date1);
        System.out.println("연도 변경 날짜 : " + date2);
        System.out.println("월 변경 날짜 : " + date3);
        System.out.println("일 변경 날짜 : " + date4);



    }
}

```
```
현재 날짜 : 2024-03-08
연도 변경 날짜 : 2020-03-08
월 변경 날짜 : 2024-12-08
일 변경 날짜 : 2024-03-17
```
5. 날짜 더하고 빼기

```java

public class Ex06 {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = date1.plusDays(100);
        LocalDate date3 = date2.minusMonths(30);

        System.out.println(date1);
        System.out.printf("100일 후 : %s%n", date2);
        System.out.printf("30개월 전 : %s",date3);
    }
}
```
```
2024-03-08
100일 후 : 2024-06-16
30개월 전 : 2021-12-16
```

6. 날짜 비교

```java

public class Ex07 {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = date1.plusWeeks(1);
        System.out.println("현재 날짜 : " + date1);
        System.out.println("상대 날짜 : " + date2);

        // <날짜비교> date2가 date1보다 뒤의 날짜인가?
        boolean comp = date2.isAfter(date1);
        System.out.println("date2가 date1 보다 뒤의 날짜인가? " + comp);

        // <날짜 차이 계산> date2-date1= ?
        int diff = date2.compareTo(date1);
        System.out.println("둘 사이의 날짜 차이는? " + diff);
    }
}
```
```
현재 날짜 : 2024-03-08
상대 날짜 : 2024-03-15
date2가 date1 보다 뒤의 날짜인가? true
둘 사이의 날짜 차이는? 7
```


## 2.String

> 주요 메서드들

|메서드|반환값|설명|
|:----|:---:|:---:|
|charAt(int n)||n번째 문자 반환|
|concat(String str)||두 문자열 연결|
|contains(String str)|||
|endsWith(String suffix)|
|startsWith(String prefix)|
|equals(String str)|
|indexOf(String str)|
|indexOf(String str, int fromIndex)|
|lastIndexOf(String str)|
|lastIndexOf(String str, int fromIndex)|
|format(String format, object... args)|
|hashCode()|
|isBlank()|
|isEmpty()|
|length()|
|lines()|
|match(String str)|
|repeat(int n)|
|replace(char a, char b)|
|replaceFirst(String a, String b)|
|replaceAll(String "정규식", String "대체문자열")|
|split(String a)|
|split(String a(분할기준), String b(최대 분할 수))|
|subSequence(int a, int b)|
|toCharArray()|
|toLowerCase()|
|toUpperCase()|
|String.valueOf(A)|
|strip()|
|trim()|

<br>


## 3.Stream

<br>


### 1. 개요

Collection F/W를 통해 관리하는 데이터를 처리하기 위해 주로 사용

Stream API의 다양한 기능들은 대부분 람다를 필요로 하기 때문에 람다를 이해하고 사용할 수있어야 한다.

*메서드 참조(::) / 람다 필수!

```java
List<String> list = Arrays.asList("Lee", "Park", "Kim");

//기존
Iterator<String> it = list.iterator();
while(it.hasNext()) {
	System.out.println(it.next()};
```

```java
List<String> list = Arrays.asList("Lee", "Park", "Kim");

//Stream 활용
list stream().forEach(name -> System.out.println(name));
```

BaseStream : Stream API의 최상위 인터페이스

| 메서드 | 기능 |
| --- | --- |
| long count() | 해당 스트림에 포함된 항목의 수를 반환. |
| Stream concat(Stream, Stream) | 파라미터로 전달되는  두 개의 스트림을 하나의 스트림으로 반환 |
| R collet(Collector) | 스트림의 항목들을 컬렉션 타입의 객체로 반환 |
| Stream filter(Predixate) | 스트림의 항목들을 파라미터의 조건에 따라 필터링하고 결과 항목들을 스트림 형태로 반환 |
| void forEach(Consumer) | 스트림 항목들에 대한 순회(최종 연산) |
| Optional reduce(BinaryOperator) | 람다 표현식을 기반으로 데이터를 소모하고 그 결과를 반환(최종 연산) |
| Object[] toArray() | 스트림 항목들을 배열 객체로 반환 |
| Stream sotred() | 스트림 항목들에 대해 정렬하고 이를 스트림으로 반환  |
|  |  |

### 2. 스트림 객체 생성 방법

#### (1) Collection 객체를 통한 방법(일반적인 방법)

- 이미 데이터가 모여있고, 모인 데이터를 처리할 때  사용

모든 컬렉션 객체는 stream을 반환받을 수 있다. 

<aside>
✅ Collection
 - List, Set, Queue 계열 
Map

</aside>

컬렉션 인터페이스  안에 stream객체를 반환하는 메서드가 default 메서드로 정의되어 있음  → List, Set, Queue 계열의 모든 Collection 객체들이 모두 Stream을 반환할 수 있다. (Map도 마찬가지)


```java
List<String> list =
		Arrays.asList("Lee", "Kim", "Park", "Song", "Choi");
		
Stream<String> stream = list.stream();
```

#### (2). 스트림 빌더를 통한 방식

- 데이터가 존재하지 않고,  스트림 자체적으로 직접 데이터를 추가해서 사용할 때 사용

| 메서드 | 기능 |
| --- | --- |
| void accept(T) | 스트림 빌더에 데이터 추가. |
| Stream.Builder<T> add(T) | 스트림 빌더에 데이터를 추가하고, 스트림 반환 |
| Stream<T> build() | 스트림 빌더에 데이터 추가를 종료하고 스트림 반환 |

```java
Stream.Builder<String> builder = Stream.builder();
builder.accept("Kim");
builder.accept("Lee");
builder.accept("Song");
builder.accept("Park");
builder.accept("Lee");

Stream<String> stream = builder.build();
stream.forEach(System.out::println);
```

#### 한번 생성한 스트림은 사용 후 다시 사용할 수 없으며 전체 데이에 대한 처리가 이루어지면 종료된다.

```java
List<String> list =
		Arrays.asList("Lee", "Kim", "Park", "Song", "Choi");
		
Stream<String> stream = list.stream(); //스트림 생성
System.out.println(stream.count()); //stream 사용
stream.forEach(System.out::println); //Exception 발생
```

### 3. 스트림 연산

- 스트림을 이용한 연산은 각 연산의 연결을 통해 파이프라인을 구성할 수 있다.
- 스트림을 이용한 연산 처리는 스트림 객체의 생성 - 중간 연산 - 최종 연산 단계로 구분


#### (1) 중간 연산

- filter, map과 같은 연산으로 Stream 반환
- 중간 연산은 연속해서 호출하는 메서드 체이닝으로 구현 가능
- 최종연산이 실행되어야 중간연산이 처리되므로 중간 연산들로만 구성된 메서드 체인은 실행되지 않는다.

| 연산 | 반환 형식 | 연산 인수 |
| --- | --- | --- |
| filter | Stream<T> | Predicate<T> |
| map | Stream<T> | Function<T, R> |
| limit | Stream<T> |  |
| sorted | Stream<T> | Comparator<T> |
| distinct(중복 제거) | Stream<T> |  |
| peek | Stream<T> | Consumer<T> |
| skip | Stream<T> |  |

#### (2) 최종 연산

- forEach, collect와 같은 연산으로 void를 반환하거나 컬렉션 타입을 반환
- 중간 연산을 통해 가공된 스트림은 마지막으로 최종연산을 통해 각 요소를 소모하여 결과를 출력합니다.
- 즉, 지연(lazy)되었던 모든 중간 연산들이 최종연산시 모두 수행되는 것
- 최종 연산 후에는 한번 생성해서 소모한 스트림은 닫히게 되고, 재사용이 불가능하다.

| 연산 | 반환 식 |
| --- | --- |
| forEach | 스트림의 각 요소를소비하여 람다 적용, void 반환 |
| count | 스트림 요소의 수를 반환, Long 반환 |
| collect | List, Map 형태의 컬렉션 반환  |
| sum | 스트림의 모든 요소에 대한 합을 반환 |
| reduce | 스트림의 요소를 하나씩 줄여가며 연산 수행 후 결과 반환, Optional 반환  |

### 스트림 연산 활용
## (1) 필터링

전체 데이터에서 불필요한 데이터를 없애고 원하는 데이터를 정확히 추출하기 위한 과정

filter(): 데이터 추출

 distinct(): 중복제거

```java

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
        Stream<Customer> stream = customers.stream(); //customers 컬렉션으로부터 stream객체를 생성하여 받음
        stream.filter( customer -> customer.getAge() > 30 ) //customer의 나이가 30 이상인 것만 필터링
                .forEach(System.out::println);

        System.out.println("-----------------------");

        //distinct 사용 예시
        Stream<Customer> stream1 = customers.stream();
        stream1.filter( customer -> customer.getAge() > 30)
                .distinct()
                .forEach(System.out::println);
    }
}
```



## (2) Sorted 정렬

- sorted()를 이용한 정렬을위해서는 반드시 대상 객체들이 Comparable 인터페이ㅡ를 구현한 클래스, 즉 비교 가능한 객체여야 한다.
- Comparable 객체가 아닐 경우나 역순 정렬, 혹은 다른 조건의 정렬에는 Comparator 인터페이스가 제공하는 여러 dafault, static 메서드를 이용해 정렬을 구현한다.

```java
package stream;

public class Customer implements Comparable<Customer> {
	.
	.
	.
    /**
     * 객체를 어떤 식으로 정렬할지 정의
     * @param customer the object to be compared.
     * @return
     */
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
```

```java
package stream;

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
        customers.stream()
                .sorted(Comparator.comparing(Customer::getName))
                .forEach(System.out::println);
    }
}

```

## (3) 맵핑

- 스트림의 매핑 연산은 스트림이 관리하는 데이터를 다른 형태의 데이터로 변환할 수 있도록 해준다.
- 매핑 연산의 메서드는 map(), mapToInt(), mapToDouble(), mapToLong()이 잇다.
- double, int, long 기본형 데이터 타입의 데이터를 처리하기 위한 메서드들은 매핑된 값의 결과가 기본형 데이터 타입일 경우 적용하여 사용한다.

```java
package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class mapping {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Kim", 33));
        customers.add(new Customer("Park", 21));
        customers.add(new Customer("Song", 45));
        customers.add(new Customer("Lee", 67));
        customers.add(new Customer("Choi", 19));

        List<String> names = customers.stream()
                .map(Customer::getName)
                .collect(Collectors.toList());
        names.stream().forEach(System.out::println);

        customers.stream()
                .map(Customer::getName)
                .forEach(System.out::println);
    }
}

```

## (4)최종연산

- 최종 연산: forEach() 메서드 이용
- collect() 메서드는 스트림 처리 이후 처리된 데이터에 대해 Collection 객체로 반환하는 메서드
    - collect(Collectors.toList());
    - collect(Collectors.toSet());
    - collect(Collectors.toMap());
- 스트림의 최종 연산은 forEach()와 같은 스트림 처리 결과를 바로 확인할 수 있는 연산이 있고, 데이터를 모두 소모한 후에 그 결과를 알 수 있는 count()와 같은 연산이 있다.

| 연산 | 반환 형식 |
| --- | --- |
| allMatch | 파라미터로 전달되는 람다식 기준으로 스트림 데이터가 모두 일치하는지 확인  |
| anyMatch | 파라미터로 전달되는 람다식 기준으로 스트림 데이터가 하나라도 일치하는지 확인 |
| noneMatch | 파라미터로 전달되는 람다식 기준으로 스트림 데이터가 모두 일치하지 않는지를 확인 |
| findFirst | 스트림 데이터 중에서 가장 첫번째 데이터를 반환 |
| reduce | 스트림 데이터 중에서 임의의 데이터를 반환  |

참고 문헌 : https://www.youtube.com/watch?v=7cVPlgyx3d8
