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

    boolean isEmpty(){
        return top == -1;
    }
    public  void push(int x){
        if(isFull()){
            System.out.println("stack is full");
        }else{
        top++;
        arr[top] = x;
        System.out.println("insertion : " + x);
        }
    }

    public  void pop(){
        if(isEmpty()){
            System.out.println("stack is Empty");
        }
        else{
            System.out.println("Removing :" + arr[top]);
            top--;

        }
    }
   public  void printStack(){
        System.out.println("printing stack :");
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }

    public void size(){
        System.out.println(top+1);
    }
    public static void main(String[] args) {
        Stack myStack = new Stack(5);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.pop();
        myStack.pop();
        
      myStack.printStack();
      myStack.size();
        
    }
  
}