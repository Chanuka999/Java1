import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        int[] arr =new int[5];

        int size = 5;

        Scanner sun = new Scanner(System.in);
       
        System.out.println("Enter the Data:");
        for(int x=0;x<size;x++){
            arr[x] = sun.nextInt();
  
        }
        System.out.println("Out of Array:");
          for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
          }
      
    }
}