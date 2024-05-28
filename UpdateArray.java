import java.util.Scanner;
public class UpdateArray {
    public static void main(String[] args) {
        
        int arr[] =new int[10];

        int size =5;
     Scanner sun = new Scanner(System.in);

     System.out.println("Enter the data:");
     for(int i=0;i<size;i++){
        arr[i]=sun.nextInt();
     }
     System.out.println("Out of data:");
     for(int j=0;j<size;j++){
        System.out.println(arr[j]);
     }
     System.out.println("Enter the index:");
     int update = sun.nextInt();

     System.out.println("Enter the new data:");
     int data= sun.nextInt();

     arr[update]= data;

     System.out.println("Out of data:");
     for(int j=0;j<size;j++){
        System.out.println(arr[j]);
     }
    }
}
