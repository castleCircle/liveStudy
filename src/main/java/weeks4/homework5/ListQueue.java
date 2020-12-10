package weeks4.homework5;

import weeks4.homework2.ListNode;

public class ListQueue {

    ListNode listNode;
    int count;
    int size;

    public ListQueue(int size){
        this.size = size;
        this.count = 0;
        listNode = new ListNode();
    }

    public boolean offer(int data){
        if(count>=size){
            throw new RuntimeException();
        }
        ListNode addListNode = new ListNode(data);
        listNode.add(listNode,addListNode,++count);
        return true;
    }

    public int poll(){
        if(count<0){
            throw new RuntimeException();
        }

        int returnValue = listNode.getNextListNode().getData();

        listNode.remove(listNode,1);
        --count;
        return returnValue;
    }

    public int getSize(){
        if(listNode.getNextListNode() == null){
            return 0;
        }
        ListNode getlistNode = listNode.getNextListNode();
        int sizeNum = 0;
        while(getlistNode!=null){
            sizeNum++;
            getlistNode = getlistNode.getNextListNode();
        }
        return sizeNum;
    }

}
