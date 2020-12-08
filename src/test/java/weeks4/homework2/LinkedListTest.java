package weeks4.homework2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private ListNode listNode;

    @BeforeEach
    void setUp(){

        listNode = new ListNode();
        ListNode fiNode = new ListNode(1);
        ListNode seNode = new ListNode(5);
        ListNode thNode = new ListNode(3);
        ListNode foNode = new ListNode(2);
        ListNode fifthNode = new ListNode(6);

        listNode.nextListNode = fiNode;
        fiNode.nextListNode = seNode;
        seNode.nextListNode = thNode;
        thNode.nextListNode = foNode;
        foNode.nextListNode = fifthNode;
    }


    @Test
    @DisplayName("add 테스트")
    void addTest(){
        listNode.add(listNode,new ListNode(8),3);
        ListNode temp = listNode;
        int[] data = new int[6];
        int count=0;
        while(temp.nextListNode!=null){
            data[count++] = temp.nextListNode.data;
            temp = temp.nextListNode;
        }
        Assertions.assertEquals(8,data[2]);

    }

    @Test
    @DisplayName("remove 테스트")
    void remove(){

        ListNode temp = listNode.remove(listNode,3);
        while(temp.nextListNode!=null){
            Assertions.assertNotEquals(3,temp.nextListNode.data);
            temp = temp.nextListNode;
        }
    }


    @Test
    @DisplayName("contains 테스트")
    void contains(){
        Assertions.assertFalse(listNode.contains(listNode,new ListNode(5)));
        ListNode newNode = new ListNode(11);
        listNode.add(listNode,newNode,6);
        Assertions.assertTrue(listNode.contains(listNode,newNode));
    }

}