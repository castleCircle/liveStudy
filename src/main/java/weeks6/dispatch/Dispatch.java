package weeks6.dispatch;

import java.util.Arrays;
import java.util.List;

public class Dispatch {

    static abstract class Service{
        abstract void run();
    }

    static class MyService1 extends Service{
        @Override
        void run() {
            System.out.println("run1");
        }
    }

    static class MyService2 extends Service{
        @Override
        void run() {
            System.out.println("run2");
        }
    }

    public static void main(String[] args) {
        List<Service> svc = Arrays.asList(new MyService1(),new MyService2());
        svc.forEach(Service::run);
    }




}


////static dispatch란?

//package weeks6.dispatch;
//
//public class Dispatch {
//
//    static abstract class Service{
//        abstract void run();
//    }
//
//    static class MyService1 extends Service{
//        @Override
//        void run() {
//            System.out.println("run1");
//        }
//    }
//
//    static class MyService2 extends Service{
//        @Override
//        void run() {
//            System.out.println("run2");
//        }
//    }
//
//    public static void main(String[] args) {
//        Service svc = new MyService1(); // 이시점에는 컴파일시점에는 myService1 , myService2의 run을 쓸지 결정되어 있지 않다.
//        svc.run(); //요때 일어나는게 다이나믹 디스패치 , 할당된 오브젝트가 뭐냐로 판단해서 호출하게 됨
//        //receiver parameter에 this가 MyService가 들어가게 된다.
//    }
//}
//
//
//////1. static dispatch란?
//Method Signature ( name , parameter types ) 같으면 오버라이딩 가능
//Method Type (return type , method type parameter , method argument types , exception) => 메소드 타입이 같아야 Method Reference를 사용할수 있다.

