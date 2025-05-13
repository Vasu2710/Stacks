/*
    Stack implementation using array
*/

class StackImplUsingArr {
    int topIdx= -1;
    int currSize = 0;
    int[] stack = new int[10];
    
    //functions
    void pop(){
        if(topIdx == -1){
            System.out.println("Stack is already empty!!");
            return;
        }
        topIdx--;
        currSize--;
        return;
    }
    void push(int n){
        if(currSize == 10){
            System.out.println("Stack is already full!!");
            return;
        }
        topIdx++;
        currSize++;
        stack[topIdx] = n;
        return;
    }
    int top(){
        if(topIdx == -1){
            System.out.println("Stack is empty. Returning -1");
            return -1;
        }
        return stack[topIdx];
    }
    int size(){
        return currSize;
    }
    boolean isEmpty(){
        return topIdx == -1;
    }
    boolean isFull(){
        return currSize == 10;
    }
    public static void main(String[] args) {
       StackImplUsingArr stack  = new StackImplUsingArr();
       stack.push(10);
       System.out.println(stack.top());
       stack.pop();
       stack.pop();
       System.out.println(stack.size());
    }
}