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
cal환|
|concat(String str)|
|contains(String str)|
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
