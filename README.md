## 목차

<br>

[1.java.time 패키지](#1-java.time)

[2.Java.lang.String 패키지](#2String)



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
