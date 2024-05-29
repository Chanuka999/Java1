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
    int[] arr = {8,2,5,10,4};

    int size=5;

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