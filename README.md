목차
<br>
[1.java.time 패키지](#1-java.time)

[2.Java.lang.String 패키지](#2String)



<hr>

## 1. java.time
<br>
날짜와 시간에 관련된 패키지로는 Date, Calendar, time, LocalDate(Time) 패키지 등이 있다.
Java.util.Date 패키지는 JDK1.0에서 쓰이던 패키지인데, 기능 부족 문제로 대부분 JDK1.1부터 Calendar 패키지로 교체되었다.
하지만 Java.util.Calendar 패키지 역시 기능이 충분치 않았기 때문에, 몇 가지 기능이 보완, 개선된 java.time 패키지가 추가되었다. 

### 1-1. java.util.Calendar
<br>
> 내장 메서드 

 - set() 
 
<br>

<br>

|메서드|반환값|설명|
|:----|:---:|:---:|
|getInstance()|static Calendar|현재날짜의 연/월/일/시간/지역 등의 모든 정보 출력 |
|getTime()|final Date|현재 날짜의 표준시/년/월/일/시간 출력|
|set(int field, int value)|void|set(연도/월/시/분/초 등 , 바꿀 값 )|
|set(int year, int month, int date)|final void|년/월/일 직접 설정|
|add(int field, int amount)|abstract void|현재날짜(혹은 지정한 날짜)의 field에 amount만큼 값을 더함)|


- set()
- add()

<hr>
## 2.String

