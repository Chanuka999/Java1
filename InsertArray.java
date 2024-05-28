import java.util.Scanner;
public class InsertArray {
    public static void main(String[] args) {
        
        int[] arr = new int[10];
        Scanner sun = new Scanner(System.in);
        int size=5;

        System.out.println("Enter the Data:");
        for(int i=0;i<size;i++){
            arr[i]=sun.nextInt();
        }
        System.out.println("out of data:");
        for(int j=0;j<size;j++){
            System.out.println(arr[j]);
        }

        System.out.println("Enter the Index:");
        int ind=sun.nextInt();

        System.out.println("Enter the Element:");
        int ele=sun.nextInt();

        size++;

        for(int k=size;k>=ind;k--){
            arr[k]=arr[k-1];
        }

        arr[ind] =ele;

        System.out.println("out of Array:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
