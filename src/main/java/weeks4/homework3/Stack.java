package weeks4.homework3;

public class Stack {

    int[] array;
    int top;

    public Stack(int size){
        array = new int[size];
        top = 0;
    }

    public void push(int data){
        if(top+1 <= array.length){
            array[top] = data;
            top++;
        }else{
            throw new RuntimeException();
        }
    }

    public int pop() throws Exception {

        if(top-1<0){
            throw new RuntimeException();
        }

        int topData = array[--top];

        return topData;
    }

    public int getTop(){
        return top;
    }


}
