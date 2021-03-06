# JavaBasic-1
Inflearn - JavaProgramming Basic Course (renew ver.) 11강 객체지향프로그래밍~

목차 
====

[11강 - 객체 지향 프로그래밍이란?](#11강---객체-지향-프로그래밍이란?)

[12강 - 클래스 제작과 객체 생성](#12강---클래스-제작과-객체-생성)

[13강 - 메서드](#13강---메서드)

[14강 - 객체와 메모리](#14---객체와-메모리)

[15강 - 생성자와 소멸자 그리고 this 키워드](#15강---생성자와-소멸자-그리고-this-키워드)

[16강 - 패키지와 static](#16강---패키지와-static)

[17강 - 데이터 은닉](#17강---데이터-은닉)

[18강 - 상속](#18강---상속)

[19강 - 상속 특징](#19강---상속-특징)

[20강 - 내부 클래스와 익명 클래스](#20강---내부-클래스와-익명-클래스)

[21강 - 인터페이스 ~ ](https://github.com/HanMG/JavaBasic-2)


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

15강 - 생성자와 소멸자 그리고 this 키워드
------------

15-1 디폴트 생성자
`````
객체가 생성될때 가장 먼저 호출되는 생성자로, 만약 개발자가 명시하지 않아도 컴파일 시점에 자동 생성된다.
`````
15-2 사용자 정의 생성자
`````
디폴트 생성자 외에 특정 목적에 의해서 개발자가 만든 생성자로, 매개변수에 차이가 있다.
`````
15-3 소멸자
`````
객체가 GC에 의해서 메모리에서 제거 될 때 finalize() 메서드가 호출된다.
`````
15-4 this 키워드
`````
현재 객체를 가리킬 때 this를 사용한다.
`````

16강 - 패키지와 static
-------------

16-1 패키지(package)
`````
java 프로그램은 많은 클래스로 구성되고, 이러한 클래스를 폴더 형식으로 관리하는 것을 패키지라고 한다.

*패키지 이름 결정 요령
1. 패키지이름은 패키지에 속해있는 클래스가 최대한 다른 클래스와 중복되는 것을 방지하도록 만든다.
2. 일반적으로 패키지 이름은 도메인을 거꾸로 이용한다. 
Ex) inflearn.com => com.inflearn.~
3. 개발 중에 패키지의 이름과 구조는 변경될 수 있다.
4. 패키지 이름만 보고도 해당 패키지 안에 있는 클래스가 어떤 속성과 기능을 가지고 있는 예상이 될 수 있도록 이름을 만든다.
``````

16-2 import
`````
다른 패키지에 있는 클래스를 사용하기 위해서는 import 키워드를 이용한다.
Ex) import com.inflearn.user.User;
`````

16-3 static
`````
클래스의 속성과 메서드에 static 키워드를 사용하면 어디서나 속성과 메서드를 공유 할 수 있다.
`````

17강 - 데이터 은닉
------------

17-1 멤버변수의 private 설정
`````
멤버 변수(속성)은 주로 private으로 설정해서, 외부로부터 데이터가 변질되는 것을 막는다.
`````

17-2 setter, getter
`````
멤버 변수를 외부에서 변경할 수 있도록 하는 메서드이다.
``````

18강 - 상속
-----------

18-1 상속이란?
`````
부모 클래스를 상속 받은 자식 클래스는 부모 클래스의 속성과 기능도 이용 할 수 있다.
`````

18-2 상속의 필요성
`````
기존의 검증된 class를 이용해서 빠르고 쉽게 새로운 class를 만들 수 있다.
`````
18-3 상속 구현

`````
extend 키워드를 이요해서 상속을 구현한다.

Ex) public class ChildClass extends ParentClass{ ... } 

*자바는 다중 상속은 지원 안함, 다른 언어는 지원하기도함
``````

18-4 부모클래스의 private 접근자
`````
자식 클래스는 부모 클래스의 모든 자원을 사용할 수 있지만, private 접근자의 속서오가 메서드는 사용할 수 없다.
`````

19강 - 상속 특징
--------------

19-1 메서드 오버라이드 ( override)
``````
부모 클래스의 기능을 자식 클래스에서 재정의 해서 사용한다.
``````

19-2 자료형 ( 타입 )
`````
기본 자료형처럼 클래스도 타입이다.
`````

19-3 Object 클래스
`````
모든 클래스의 최상위 클래스는 Object 클래스이다.

*이클립스에서 ctrl+t로 상속 관계를 볼 수 있음
`````

19-4 super 클래스
`````
상위 클래스를 호출할 때 super키워드를 이용한다.

*내 객체 => this. / 상위 클래스 => super.
``````

20강 - 내부 클래스와 익명 클래스
-------------

20-1 내부 ( inner ) 클래스
`````
클래스 안에 또 다른 클래스를 선언하는 것으로 이렇게 하면 두 클래스의 멤버에 쉽게 접근할 수있다. 

요즘은 잘 사용하지 않음.
`````

20-2 익명 ( anonymous ) 클래스
`````
이름이 없는 클래스로 주로 메서드를 재정의 하는 목적으로 사용된다.
인터페이스나 추상클래스에서 주로 이용된다.

Ex) 
// 익명(anonymous) 클래스 
new AnonymousClass(){

	@Override
	public void method(){
		내용		
	};
}.method();
`````
