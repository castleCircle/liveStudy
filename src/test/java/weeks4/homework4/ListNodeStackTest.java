package weeks4.homework4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import weeks4.homework2.ListNode;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeStackTest {

    private ListNodeStack stack;

    @BeforeEach
    void setUp(){
        stack = new ListNodeStack();
    }

    @Test
    @DisplayName("stack push")
    void push(){
        stack.push(1);
        stack.push(2);
        stack.push(3);

        ListNode listNode = stack.listNode.getNextListNode();
        int[] arrays = {1,2,3};

        int count = 0;
        while(listNode!=null){
            ListNode finalListNode = listNode;
            Assertions.assertEquals(arrays[count],finalListNode.getData());
            listNode = listNode.getNextListNode();
            count++;
        }
        Assertions.assertEquals(3,count);
    }

    @Test
    @DisplayName("stack pop")
    void pop(){
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assertions.assertEquals(3,stack.pop());
        Assertions.assertEquals(2,stack.pop());
        Assertions.assertEquals(1,stack.pop());
        Assertions.assertThrows(RuntimeException.class,()->stack.pop());
    }

}