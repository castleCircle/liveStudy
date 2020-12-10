package weeks4.homework5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import weeks4.homework2.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class ListQueueTest {

    private ListQueue listQueue;

    @BeforeEach
    public void setUp(){
        listQueue = new ListQueue(2);
    }

    @Test
    @DisplayName("offer")
    public void offerTest(){
        listQueue.offer(4);
        listQueue.offer(2);
        Assertions.assertEquals(2,listQueue.getSize());
        Assertions.assertThrows(RuntimeException.class,()->{
           listQueue.offer(3);
        });
    }

    @Test
    @DisplayName("poll")
    public void pollTest(){
        listQueue.offer(4);
        listQueue.offer(2);
        int data = listQueue.poll();
        Assertions.assertEquals(4,data);

        data = listQueue.poll();
        Assertions.assertEquals(2,data);
    }


}