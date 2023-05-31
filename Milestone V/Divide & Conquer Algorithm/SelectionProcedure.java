public class SelectionProcedure {

    public static int partition(int arr [], int l, int h){

        int i = l;
        int pivot = arr[l];

        for(int j = i+1 ; j<=h; j++){
            if(arr[j]<=pivot){
                i++;
                //Swap(arr[i], arr[j])
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //Swap(arr[l], arr[i]))
        //to return the correct index of the pivot element
        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static int selectionProcedure(int arr [], int l, int h, int k){
        int m = partition(arr, l, h);

        if(m == k-1){
            return m;
        }
        else if(m < k-1){
            return selectionProcedure(arr, m+1, h, k);
        }
        else
        {
            return selectionProcedure(arr, l, m-1, k);
        }
    }

    public static void main(String[] args) {
        int arr [] = {50,30,70,90,10,34,39,98,13};
        int n = arr.length;
        int k = 3;

        int result = selectionProcedure(arr, 0, n-1, k);
        System.out.println("Kth smallest element in an array is: "+result);
    }
}
