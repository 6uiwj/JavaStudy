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

<hr>

## 2.String

