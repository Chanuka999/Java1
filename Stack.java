public class Stack{
    int[] arr;
    int top;
    int capacity;

    Stack(int size){
       arr= new int[size];
       top = -1;
       capacity = size;
    }
    
   boolean isFull(){
       return top+1 == capacity;
    }

    void push(int x){
        top++;
        arr[top] = x;
        System.out.println("insertion : " + x);
    }
    public static void main(String[] args) {
        Stack myStack = new Stack(5);

        myStack.push(10);
    }
  
}