public class Main4216 {
    public static  void selectionSort(int[]arr){
        int minIndex=0;
        for (int i = 0; i < arr.length-1; i++) {
            minIndex=i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]<arr[minIndex])
                    minIndex=j;//4
            }//8 跟４交換
            //arr[i]<->arr[minIndex]
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        for( int i:arr){
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        int[]array={9,8,6,4,3,7};
        System.out.println("Driginal array:");
        for( int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
        selectionSort(array);


    }
}
