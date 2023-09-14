class NoOfInversionsBrut{

    public static int inversionCount(int arr [], int n){
        int count = 0;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                //Property of inversion
                // i<j
                // arr[i] > arr[j]
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr [] = {1,5,2,8,3,4};
        int n = arr.length;

        int count = inversionCount(arr, n);
        System.out.println("The inversion count of an array is: "+count);
    }
}
