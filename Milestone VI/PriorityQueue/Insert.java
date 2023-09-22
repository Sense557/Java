public class Insert {
    static int size = 0;
    static int[] heap = new int[100];
    
    public static void insert(int x){
        size++;
        heap[size-1] = x;
        int i = size-1;
        while(i>0 && heap[(i-1)/2] > heap[i] ){
            swap( (i-1)/2 , i );
            i = (i-1)/2 ; 
        }
    }

    public static int getMin(){
        return heap[0];
    }
    public static void print(){
        for(int i=0 ; i<size ; i++){
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int a , int b){
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] =temp;
    }
    public static void main(String[] args) {
        insert(10);
        insert(8);
        insert(6);
        System.out.println("Before insertion");
        print();
        System.out.println("After insertion");
        insert(7);
        print();
        System.out.println("Min element :"+getMin());

    }
}
