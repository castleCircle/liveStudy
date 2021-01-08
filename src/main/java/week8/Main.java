package week8;


public class Main {


    //1.인터페이스 정의하는 방법
    /*
        자바8 이전
        : 상수 , 추상 메소드만 가능
        => 강세성이 강함을 유추
        자바8 이후
        : default , static method가 추가됨
        => 강제성 안에 유연성을 추가함

        public interface 인터페이스명{

           //상수
           타입 상수명 = 값;
           => 절대적 , 제공해주는 값만 사용해라

           //추상 메소드
           리턴타입 메소드명();
           => 강제적 , 해당 메소드를 무조건 오버라이딩해서 재구현한후 사용해라

           //디폴트 메소드
           default 리턴타입 메소등명(){
            구현
           }
           => 선택적, 기본적으로 제공해주니 , 오버라이딩을 해서 사용해도 되고 아니면 그냥 디폴트 메소드로 사용해라

           //static 메소드드
           static 리턴타입 메소드명(){
            //구현
           }
           => 강제적 , 오버라이딩 할수없고 인터페이스에서 제공되는 형태로만 사용가능
        }

        //추상 클래스와 인터페이스 차이점
        1. 추상 클래스는 일반 메소드와 추상 메소드만 가질수 있다.
         But,인터페이스는 추상 메소드만 가질수 있다. ( 자바8 이후부턴 , static , default method 사용 가능 )
        2. 추상 클래스와 달리 인터페이스에선 변수와 메소드에 기본적으로 선언되는것이 있다. ( default , static 메소드 제외 )
        변수 : public static final
        메소드 : public abstract
        컴파일러가 자동 수행
    */
    //2.인터페이스 구현하는 방법
    /*
    클래스는 implements 키워드를 통해 인터페이스를 구현할수 있다.

    구현 클래스
    : 인퍼테이스를 구현한 클래스
    public class A implements 인터페이스명{

    }

    public interface Car {
        void go();
        void stop();
    }

    public class Sonata implements Car{
        @Override
        public void go() {
            System.out.println("소나타 간다");
        }

        @Override
        public void stop() {
            System.out.println("소나타 멈춘다.");
        }
    }

    public class TestMain{
        public static void main(String[] args) {
            Car car = new Car() {
                @Override
                public void go() {
                    System.out.println("간다");
                }

                @Override
                public void stop() {
                    System.out.println("멈춘다.");
                }
            };

            Car car1 = new Sonata();
            car1.go();
            car1.stop();
            System.out.println("=======================");
            car.go();
            car.stop();
        }
    }

    익명 구현 객체

    일회성의 구현 객체를 만들기 위해 사용하는 방법

    */
    //3.인터페이스 레퍼런스를 통해 구현체를 사용하는 방법
    /*

    public interface Car {
        void go();
        void stop();
    }


    public class Sonata implements Car{
        @Override
        public void go() {
            System.out.println("소나타 간다");
        }

        @Override
        public void stop() {
            System.out.println("소나타 멈춘다.");
        }

        public void sonataFunction(){
            System.out.println("sonataFunction");
        }
    }

    public class TestMain{
        public static void main(String[] args) {

            //클래스 타입 레퍼런스는 해당 클래스에 정의된 메소드 호출 가능
            Sonata sonata = new Sonata();
            sonata.go();
            sonata.stop();
            sonata.sonataFunction();

            System.out.println("====================");

            //인스턴스 레퍼런스는 해당 인터페이스를 구현한 캘래스 인스턴스를 가리킬 수 있고 해당 인터페이스에 선언된 메서드만 호출 가능
            Car car1 = new Sonata();
            car1.go();
            car1.stop();
        }
    }

    */
    //4.인터페이스 상속
    /*
        인터페이스는 인터페이스간에 상속을 할수있다.
        클래스와 달리 다중상속이 가능
        extends 키워드 사용
        인터페이스를 구현한 클래스는 모든 상위 인터페이스를 오버라이딩 해야함

        package study.interfacetest;

        public interface ObjectCar {
            void carTypePrint();
        }

        public interface Car extends ObjectCar{
            void go();
            void stop();
        }


        public class Sonata implements Car{

            @Override
            public void go() {
                System.out.println("소나타 간다");
            }

            @Override
            public void stop() {
                System.out.println("소나타 멈춘다.");
            }

            public void sonataFunction(){
                System.out.println("sonataFunction");
            }

            @Override
            public void carTypePrint() {
                System.out.println("Real Car");
            }
        }


     */



    //5.인터페이스의 기본 메소드(Default Method), 자바 8
    //https://www.notion.so/4b0cf3f6ff7549adb2951e27519fc0e6
    /*
        자바8부터 생긴 기능
        interface에서도 메소드 구현 가능!!
        메소드 signatures뿐만 아니라 implementation(구현)을 할수있게 됨
        구현체가 모르게 추가된 기능으로 그만큼의 리스크가 존재

        public default 리턴타입 메소드명(){
           선언
        }

        오버라이딩을 강제 시키지 않는다.

        public interface Car{
            void go();
            void stop();
            void autoGo();
        }

        public Acar implements Car{

            @Override
            public void go(){

            }

        }




     */

    //6.인터페이스의 static 메소드 , 자바8
    /*
        interface에서도 메소드 구현 가능!!
        메소드 signatures뿐만 아니라 implementation(구현)을 할수있게 됨
        static 메소드이기 때문에 클래스명으로 호출해야함
        오버라이딩 불가능
        해당 인터페이스와 관련된 유틸 , 공통 메소드를 제공하기 위한 용도로 사용

        static 리턴타입 메소드명() {

        }

     */

    //7.(Optional) 인터페이스의 private 메소드 , 자바 9
    /* 참고) https://howtodoinjava.com/java9/java9-private-interface-methods/
            https://wookcode.tistory.com/19?category=979588
        1. private interface method는 abstract가 될수없다.
        2. private method드는 인터페이스 내부에서만 사용 가능하다.
        3. private static , non-static method 둘다 가능
        3. private static 메소드는 인터페이스내의 static , non-static method에서 사용가능
        4. private non-static 메소드는 private static method에서 사용 불가능

        왜 만들었을까?
        특정 기능을 처리하는 내부 method임에도 불구하고 외부에 공개 될수있는 public method로 만들어야 했음.
        => 코드 중복을 피하고 인터페이스에 대한 캡슐화 가능


     */




}