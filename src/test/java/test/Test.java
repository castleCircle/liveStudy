package test;

public final class Test{ //부모가 될수 없음

    final int a = 10; //값을 변경할수 없는 멤버변수 ( 상수 )

    final void print(){ // 오버라이딩 할수없는 메서드
        System.out.println("test");
    }

}
