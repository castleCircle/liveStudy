package weeks4.homework3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack stack;

    @BeforeEach
    void setUp(){
        stack = new Stack(3);
        stack.push(5);
        stack.push(2);
        stack.push(3);
    }

    @Test
    @DisplayName("stack push Test")
    void pushTest(){
        Assertions.assertEquals(3,stack.getTop());

        Assertions.assertThrows(RuntimeException.class,() -> {
            stack.push(4);
        });
    }

    @Test
    @DisplayName("stack pop Test")
    void popTest() throws Exception {
        int data = stack.pop();
        Assertions.assertEquals(3,data);

        data = stack.pop();
        Assertions.assertEquals(2,data);

        data = stack.pop();
        Assertions.assertEquals(5,data);

        Assertions.assertThrows(RuntimeException.class,()->{
           stack.pop();
        });
    }


    @Test
    @DisplayName("e쿠폰")
    void test(){

    }


}