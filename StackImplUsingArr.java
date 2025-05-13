/*
*   Stack implementation using arrays
 */
class Stack{
    private int arr[];
    int top, currSize, maxSize;

    public Stack(){
        arr = new int[16];
        top = -1;
        currSize = 0;
    }
    public Stack(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        top = -1;
        currSize = 0;
    }
    public void push(int n){
        if(currSize == maxSize){
            System.out.println("Stack is full\nExiting...");
            System.exit(1);
        }
        top++;
        arr[top] = n;
        currSize++;
        System.out.println("The element pushed is " + n);
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack Empty\nExiting...");
            System.exit(1);
        }
        int popped = arr[top];
        top--;
        currSize--;
        return popped;
    }
    public int top(){
        if(top == -1){
            System.out.println("Stack Empty\nExiting...");
            System.exit(1);
        }
        return arr[top];
    }
    public int size(){
        return currSize;
    }
}
class StackImplUsingArr{
    public static void main(String args[]){
        Stack s = new Stack(6);
        

    }
}