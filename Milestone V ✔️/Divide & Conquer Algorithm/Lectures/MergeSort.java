class MergeSort{

    //Function to do the merge task in merge sort - mergeProcedure 
    public static void mergeProcedure(int arr [], int l, int mid, int r)
    {
        //l = lower index(i)
        //r = right index(j)
        int i, j, k;

        //size of the left and right subarray
        int n1 = mid - l + 1;
        int n2 = r - mid;

        //create left and right subarray
        int lsubarray [] = new int [n1];
        int rsubarray [] = new int [n2];

        //copy the data into the left & right subarray
        for(i = 0; i<n1; i++){
            lsubarray[i] = arr[l+i];
        }

        for(j = 0; j<n2; j++){
            rsubarray[j] = arr[mid+1+j];
        }

        //comparision between the elements in the left & right subarray
        i = 0;
        j = 0;
        k = l;

        while(i<n1 && j<n2){
            if(lsubarray[i] <= rsubarray[j]){
                arr[k] = lsubarray[i];
                i++;
            }
            else
            {
                arr[k] = rsubarray[j];
                j++;
            }
            k++;
        }

        //copying all remaining elements from the left subarray
        while(i<n1){
            arr[k] = lsubarray[i];
            i++;
            k++;
        }

        //copying all remaining elements from the left subarray
        while(j<n2){
            arr[k] = rsubarray[j];
            j++;
            k++;
        }
    }

    //Function to do the mergeSort
    public static void mergeSort(int arr [], int i, int j)
    {
        if(i<j)
        {
            //1.divide the array into the subproblems
            int mid = i + (j-i)/2;

            //left subarray
            mergeSort(arr, i, mid);

            //right subarray
            mergeSort(arr, mid+1, j);

            //3.combime the solution of all subproblems 
            mergeProcedure(arr, i, mid, j);
        }
    }

    //Function to display the array
    public static void printArr(int arr [], int n)
    {
        for(int i = 0; i<n; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr [] = {50,20,40,90,85,11,13};
        int n = arr.length;

        System.out.println("Array before sorting is: ");
        printArr(arr, n);

        System.out.println("Array after sorting is: ");
        mergeSort(arr, 0, n-1);
        printArr(arr, n);
    }
}