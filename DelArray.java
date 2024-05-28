import java.util.Scanner;
public class DelArray {
    public static void main(String[] args) {
        
        int[] arr = new int[10];
        int size =5;

        Scanner sun = new Scanner(System.in);

        System.out.println("Enter the data:");
        for(int i=0;i<size;i++){
            arr[i]=sun.nextInt();
        }

        System.out.println("out of data:");
        for(int j=0;j<size;j++){
            System.out.println(arr[j]);
        }

     System.out.println("Enter the index:");
     int ind=sun.nextInt();
     for(int k=ind;k<size;k++){
        arr[k] = arr[k+1];
     }
      size--;

      System.out.println("out of Array:");
      for(int j=0;j<size;j++){
        System.out.println(arr[j]);
      }
    }
}
