package weeks4.homework4;

import weeks4.homework2.ListNode;

public class ListNodeStack {

    int top;
    ListNode listNode;

    public ListNodeStack(){
        this.listNode = new ListNode();
        this.top = 0;
    }


    public void push(int data){
        listNode.add(listNode,new ListNode(data),++top);
    }

    public int pop(){
        if(top == 0){
            throw new RuntimeException();
        }

        return listNode.remove(listNode,top--).getData();
    }

}
