import java.util.Scanner;
public class SelectionSort{
    public static void selectionsort(int[] arr){
        int size = arr.length;
     
     
      for(int i=0;i<size-1;i++){
       int min=i;

        for(int j=i+1;j<size;j++){
           if(arr[j]<arr[min]){
            min=j;
           
        }

      }

      int smallnumber = arr[min];
      arr[min]= arr[i];
       arr[i]= smallnumber;
    }
}
   public static void main(String[] args){
    int[] arr = new int[5];

    int size=5;
    Scanner sun= new Scanner(System.in);
    System.out.println("Enter the data:");
    for(int i=0;i<size;i++){
        arr[i]=sun.nextInt();
    }

    System.out.println("brfore selection sort:");
    for(int k=0;k<size;k++){
        System.out.println(arr[k]);
    }

    System.out.println();

    selectionsort(arr);

    System.out.println("after selection sort:");
    for(int k=0;k<size;k++){
        System.out.println(arr[k]);
    }
   }
}