package weeks4.homework5;

import javax.swing.text.html.HTMLDocument;

public class ArrayQueue {

    int[] elements;
    boolean[] elementsCheck;
    int count;
    int size;

    public ArrayQueue(int size) {
        this.elements = new int[size];
        this.elementsCheck = new boolean[size];
        this.count = 0;
        this.size = size;
    }

    public boolean offer(int data){
        if(count>=size){
            throw new RuntimeException();
        }

        elements[count] = data;
        elementsCheck[count] = true;
        count++;
        return true;
    }

    public int poll(){
        if(count<0){
            throw new RuntimeException();
        }

        int returnValue = elements[0];

        for(int i=0;i<count;i++){
            if(i+1>=size){
                elements[i] = 0;
                elementsCheck[i] = false;
            }else{
                elements[i] = elements[i+1];
                elementsCheck[i+1] = false;
                elementsCheck[i] = true;
            }
        }
        --count;
        return returnValue;
    }

    public int size(){
        return count;
    }


}
