public class Stack{
    int[] arr;
    int top;
    int capacity;

    Stack(int size){
       arr= new int[size];
       top = -1;
       capacity = size;
    }
}