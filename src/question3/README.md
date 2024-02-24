# 3. Currency Exchange

### 원화를 달러/엔 으로 환전하는 프로그램을 작성해주세요. 
코드 작성 당일의 환율 정보를 참고하여 소수점 2자리 까지 계산 후 결과를 출력해주세요. (정밀도가 높은 데이터 타입을 사용할수록 가산점)

- Input: 원(KRW) = 3000000
- Output: 달러($) = 2,242.15 / JPY = 332027.36

```java
환율정보는 그날의 환율을 참고하여 고정 
1$ = ₩1338.00
100¥ = ₩903.54

cf) 소수점 2자리 Java 코드 예시
String.format(%1.2f, doubleXXX)

System.out.printf(%.2f%n, num); 

DecimalFormat decimalFormat = new DecimalFormat("0.00");
System.out.println(decimalFormat.format(num));
```

```java
<입력 예시> 
원(KRW) = **3000000**

<출력 예시>
**달러($) = 2,242.15 / JPY = 332027.36**
```