package weeks4.homework2;

import java.util.Objects;

public class ListNode {

    int data;
    ListNode nextListNode = null;

    public ListNode() {
    }

    public int getData() {
        return data;
    }

    public ListNode getNextListNode() {
        return nextListNode;
    }

    public void setNextListNode(ListNode nextListNode) {
        this.nextListNode = nextListNode;
    }

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode add(ListNode head, ListNode nodeToAdd, int position){

        ListNode listNode = head;

        for(int i=0; i<position-1 ;i++){
            listNode = listNode.nextListNode;
        }
        nodeToAdd.nextListNode = listNode.nextListNode;
        listNode.nextListNode = nodeToAdd;
        return head;
    }

    public ListNode remove(ListNode head, int positionToRemove){
        ListNode node = head;

        if(positionToRemove == 0){
            return head.nextListNode;
        }

        for(int i=0;i<positionToRemove-1;i++){
            node = node.nextListNode;
        }

        ListNode deleteNode = node.nextListNode;
        node.nextListNode = deleteNode.nextListNode;
        return deleteNode;
    }

    public boolean contains(ListNode head, ListNode nodeTocheck){
        ListNode listNode = head;
        while(listNode.nextListNode!=null){
            if(listNode.nextListNode == nodeTocheck){
                return true;
            }
            listNode = listNode.nextListNode;
        }
        return false;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return data == listNode.data &&
                Objects.equals(nextListNode, listNode.nextListNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, nextListNode);
    }
}
