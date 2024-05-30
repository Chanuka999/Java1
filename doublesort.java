public class doublesort{
    public static void DoubleSort(int[] arr , int size){
       int temp=0;
       boolean swap=true;
       while(swap){
        swap=false;
        for(int j=1;j<size;j++){
            if(arr[j-1]>arr[j]){
               temp=arr[j-1];
               arr[j-1]=arr[j];
               arr[j]=temp;
               swap=true;
            }
        }
       }
    }

    public static void main(String[] args){
        int[] arr = {8,5,4,10,2};
        int size=arr.length;

        System.out.println("unsorted Array:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

        System.out.println();

        DoubleSort(arr, size);
        System.out.println("sorted array:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}