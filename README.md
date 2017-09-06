# SumCalc
Sum of all num, odd num and even num

> ## 1. 1부터 max까지의 합

>> #### 가우스의 합 정리를 이용
>> ##### S = 1 + 2 + 3 + 4 + ... + max
>> ##### S = max(max+1)/2

```java

public long all(long max){

long total = max*(max+1)/2;

return total;

}
```

> ## 2. 1부터 max까지의 짝수의 합

>> #### 똑같이 가우스의 합 정리 이용
>> ##### S = max*(max+1)

```java

public long even(long max){

	long num = max/2; //max가 짝수이든 홀수이든 max의 순번은 max/2로 구할 수가 있음

	long total = num*(num+1);

	return total;

}
```

> ## 3. 1부터 max까지의 홀수의 합

>> #### 똑같이 가우스의 합 정리 이용
>> ##### S = max*max

```java
public long odd(long max){

	long num = (max+1)/2; //max가 짝수이든 홀수이든 max의 순번은 (max+1)/2로 구할 수가 있음

	long total = num*num;

	return total;
	}

```
