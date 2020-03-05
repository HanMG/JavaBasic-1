# JavaBasic-1
Inflearn - JavaProgramming Basic Course (renew ver.) 11강 객체지향프로그래밍~

목차 
====

[11강 - 객체 지향 프로그래밍이란?](#11강---객체-지향-프로그래밍이란?)

[12강 - 클래스 제작과 객체 생성](#12강---클래스-제작과-객체-생성)

[13강 - 메서드](#13강---메서드)

[14 - 객체와 메모리](#14---객체와 메모리)



11강 - 객체 지향 프로그래밍이란?
-----------------

11-1 객체란?

`````
세상에 존재하는 모든 것을 뜻하며, 프로그래밍에서 **속성**과 **기능**을 가지는 프로그램 단위이다.
`````

11-2 클래스란?
`````
객체를 생성하기 위한 **틀**로 모든 객체는 클래스로부터 생성된다.
`````

11-3 클래스 구성요소
`````
클래스는 속성 ( 멤버변수 ) 와 기능( 메서드 )로 구성된다.

Ex) 자전거
속성 ( 멤버변수 ) - 인장, 핸들, 바구니, 기어, 페달, 바퀴
기능 ( 메서드 ) - 기어 변속, 가속, 브레이크
`````

12강 - 클래스 제작과 객체 생성
--------------

12-1 클래스 제작
`````
클래스는 멤버 변수 ( 속성 ), 메서드 ( 기능 ), 생성자 등으로 구성된다.
* 일반적으로 클래스 이름의 첫 글자는 대문자로 한다.
`````

12-2 객체 생성
`````
클래스로 부터 'new'를 이용해서 객체를 생성한다.
Ex) 
Grandeur myCar1 = new Grandeur();
`````
12-3 생성자
`````
생성할때 매개변수를 받아 생성이 가능
* 생성자는 클래스 명과 같으며, 반환형이 없고 생성할때 필요한 내용을 내부에 기술
`````

13강 - 메서드
-------

13-1 메서드 선언과 호출
`````
메서드도 변수와 같이 선언 및 정의 후 필요시에 호출해서 사용한다.

public void getInfo(){ // 메서드 선언
	내용	// 메서드 정의
}

public => 접근자 / void => 반환형 / getInfo 메서드 명
*일반적으로 메서드 명의 첫 문자는 소문자이고 단어와 단어연결시 낙타표기법(소문자,대문자를 번갈아가며 씀), 동사+명사식으로 명명함
`````

13-2 매개변수(parameter)
`````
메서드를 호출할 떄 데이터를 전달 할 수 있다.

매개변수는 필요시에만 정의되며, 자료형과 변수(지역변수)로 이루어진다.

Ex) public void setter(int i, boolean b, double d, char c, Sring s){ ... }
`````

13-3 중복 메소드 (overloading)
`````
이름은 같고, 매개변수의 개수 또는 타입이 다른 메서드를 만들 수 있다.

** 오버로딩 & 오버라이딩
오버로딩 - 이름은 같고, 매개변수의 개수 또는 타입이 다른 메서드
오버라이딩 - 상속 시 상위 클래스가 가지고 있는 메소드를 하위 클래스에서 재정의하여 사용하는 것
`````

13-4 접근자
`````
메서드를 호출할 때 접근자에 따라서 호출이 불가 할 수 있다.

public : 모든 접근을 허용

protected : 같은 패키지(폴더)에 있는 객체와 상속 관계의 객체들만 허용

default : 같은 패키지(폴더)에 있는 객체들만 허용

private : 현재 객체 내에서만 허용
`````

14 - 객체와 메모리
-------

14-1 메모리에서 객체 생성 ( 동적 생성 )
`````
객체는 메모리에서 동적으로 생성되며, 객체가 더 이상 필요없게 되면 GC(GarbageCollector)에 의해서 제거된다.
`````

14-2 레퍼런스 ( 가리킨다 )
`````
생성한 객체의 주소를 변수에 저장하는 것을 레퍼런스라고 한다.
`````

14-3 자료형이 같아도 다른 객체 
`````
자료형이 같아도 다른 공간에 존재하는 객체는 다른 객체이다.
`````

14-4 null과 NullPointException
`````
레퍼런스에 null 저장되면 객체의 연결이 끊기며, 더이상 객체를 이용할 수 없다.

Ex)
ObjectClass obj1 = new ObjectClass();
System.out.println(obj1); // 주소값
obj1 = null;
System.out.println(obj1); // null  레퍼런스X

obj1을 쓰려면 다시 new로 생성해줘야함
`````
