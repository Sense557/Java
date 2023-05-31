class RandomizedSort{

    public static int partition(int arr [], int l, int h){

        //here pivot is not fixed  but now choosen randomly
        // generate the random index with in an array

        int randomIndex = l+(int) Math.random() % (h-l+1);
        //swap(arr[l], arr[i])

        int temp = arr[randomIndex];
        arr[randomIndex] = arr[l];
        arr[l] = temp;

        int i = l;
        int pivot = arr[l];

        for(int j = i+1 ; j<=h; j++){
            if(arr[j]<=pivot){
                i++;
                //Swap(arr[i], arr[j])
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
            }
        }
        //Swap(arr[l], arr[i]))
        //to return the correct index of the pivot element
        int tem = arr[l];
        arr[l] = arr[i];
        arr[i] = tem;

        return i;
    }

    public static void quickSort(int arr [], int l, int h){
        if(l<h){

            // divide the array into subproblems
            int m = partition(arr,l,h);

            //conquer the subproblems via recursion
            quickSort(arr, l, m-1);
            quickSort(arr, m+1, h);
        }
    }

    public static void printArr(int arr [], int n){
        for(int i = 0; i<n; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int arr [] = {50,20,40,30,70,90,10};
        int n = arr.length;

        System.out.println("Before application of quicksort the array is: ");
        printArr(arr, n);

        System.out.println("After application of quicksort the array is: ");
        quickSort(arr, 0, n-1);
        printArr(arr, n);

    }
}