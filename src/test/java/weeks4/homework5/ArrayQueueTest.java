package weeks4.homework5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayQueueTest {

    private ArrayQueue arrayQueue;

    @BeforeEach
    public void setUP(){
        arrayQueue = new ArrayQueue(5);
        arrayQueue.offer(1);
        arrayQueue.offer(2);
        arrayQueue.offer(3);
        arrayQueue.offer(4);
        arrayQueue.offer(5);
    }

    @Test
    @DisplayName("offer 테스트")
    public void offerTest(){
        Assertions.assertEquals(5,arrayQueue.size());
        Assertions.assertThrows(RuntimeException.class,()->{
                arrayQueue.offer(6);
        });
    }

    @Test
    @DisplayName("poll 테스트")
    public void pollTest(){
        int[] data = {1,2,3,4,5};

        int pollData = arrayQueue.poll();
        Assertions.assertEquals(pollData,1);

        pollData = arrayQueue.poll();
        Assertions.assertEquals(pollData,2);

        pollData = arrayQueue.poll();
        Assertions.assertEquals(pollData,3);

        pollData = arrayQueue.poll();
        Assertions.assertEquals(pollData,4);

        pollData = arrayQueue.poll();
        Assertions.assertEquals(pollData,5);

        Assertions.assertEquals(0,arrayQueue.size());


    }


}