public class InsertionSort{
     public static void InsertionsortArray(int[] arr, int size){
         for(int j=1;j<size;j++){
            int value=arr[j];
            int b=j-1;

            while(b>=0 && arr[b]>value){
                arr[b+1] = arr[b];
                b=b-1;
            }
            arr[b+1] = value;
         }
         
     }

    public static void main(String[] args){
        int[] arr = {8,5,4,10,2};

        int size = 5;

        System.out.println("UnSorted Array:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

        System.out.println();

        InsertionsortArray(arr, 5);

        System.out.println("Sorted Array:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
    }
    }
}