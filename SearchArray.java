import java.util.Scanner;
public class SearchArray {
    public static void main(String[] args) {
        
        int arr[] =new int[10];

        int size = 5;

        Scanner sun = new Scanner(System.in);

        System.out.println("Enter the data");
        for(int i=0;i<size;i++){
            arr[i]=sun.nextInt();
        }

        System.out.println("out of data:");
        for(int j=0;j<size;j++){
            System.out.println(arr[j]);
        }

        System.out.println("Enter the data for search:");
        int data = sun.nextInt();
       
        int k;
        
        for( k=0;k<size;k++){
            if(arr[k] == data){
                break;
            }
        }
        System.out.println(k);
    }
}
