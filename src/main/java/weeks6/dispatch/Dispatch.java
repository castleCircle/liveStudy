package weeks6.dispatch;

import java.util.Arrays;
import java.util.List;

public class Dispatch {
    interface Post {
        void postOn(SNS sns);
    }
    static class Text implements Post{
        @Override
        public void postOn(SNS sns) {
            sns.post(this);
        }
    }
    static class Picture implements Post{
        @Override
        public void postOn(SNS sns) {
            sns.post(this);
        }
    }

    interface SNS{
        void post(Text post);
        void post(Picture post);
    }
    static class Facebook implements SNS{

        @Override
        public void post(Text post) {
            System.out.println("text-facebook");
        }

        @Override
        public void post(Picture post) {
            System.out.println("picture-facebook");
        }
    };
    static class Twitter implements SNS{

        @Override
        public void post(Text post) {
            System.out.println("text-twitter");
        }

        @Override
        public void post(Picture post) {
            System.out.println("picture-twitter");
        }
    };

    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(new Text(),new Picture());
        List<SNS> sns = Arrays.asList(new Facebook(),new Twitter());

        posts.forEach(p->sns.forEach(s->p.postOn(s)));
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
//////1. static dispatch란? 컴파일 시점
//Method Signature ( name , parameter types ) 같으면 오버라이딩 가능
//Method Type (return type , method type parameter , method argument types , exception) => 메소드 타입이 같아야 Method Reference를 사용할수 있다.
//Dynamic Dispatch 를 두번하는게 더블 디스패치


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
//        List<Service> svc = Arrays.asList(new MyService1(),new MyService2());
//        svc.forEach(Service::run);
//    }
//
//
//
//
//}


//public class Dispatch {
//
//    interface Post {
//        void postOn(SNS sns);
//    }
//
//    static class Text implements Post{
//        @Override
//        public void postOn(SNS sns) {
//            if(sns instanceof Facebook){
//                System.out.println("text - facebook");
//            }
//
//            if(sns instanceof Twitter){
//                System.out.println("text - twitter");
//            }
//        }
//    }
//
//    static class Picture implements Post{
//        @Override
//        public void postOn(SNS sns) {
//            if(sns instanceof Facebook){
//                System.out.println("Picture - facebook");
//            }
//
//            if(sns instanceof Twitter){
//                System.out.println("Picture - twitter");
//            }
//        }
//    }
//
//    interface SNS{}
//    static class Facebook implements SNS{
//
//    };
//
//    static class Twitter implements SNS{
//
//    };
//
//    static class GooglePlus implements SNS{
//
//    };
//
//    public static void main(String[] args) {
//        List<Post> posts = Arrays.asList(new Text(),new Picture());
//        List<SNS> sns = Arrays.asList(new Facebook(),new Twitter(), new GooglePlus());
//
//        posts.forEach(p->sns.forEach(s->p.postOn(s)));
//    }
//
//
//
//}


//public class Dispatch {
//
//    interface Post {
//        void postOn(SNS sns);
//    }
//
//    static class Text implements Post{
//
//        @Override
//        public void postOn(SNS sns) {
//            sns.post(this);
//        }
//    }
//
//    static class Picture implements Post{
//        @Override
//        public void postOn(SNS sns) {
//            sns.post(this);
//        }
//    }
//
//    interface SNS{
//        void post(Text post);
//        void post(Picture post);
//    }
//    static class Facebook implements SNS{
//
//        @Override
//        public void post(Text post) {
//            System.out.println("text-facebook");
//        }
//
//        @Override
//        public void post(Picture post) {
//            System.out.println("picture-facebook");
//        }
//    };
//
//    static class Twitter implements SNS{
//
//        @Override
//        public void post(Text post) {
//            System.out.println("text-twitter");
//        }
//
//        @Override
//        public void post(Picture post) {
//            System.out.println("picture-twitter");
//        }
//    };
//
//
//    public static void main(String[] args) {
//        List<Post> posts = Arrays.asList(new Text(),new Picture());
//        List<SNS> sns = Arrays.asList(new Facebook(),new Twitter());
//
//        posts.forEach(p->sns.forEach(s->p.postOn(s)));
//    }
//}