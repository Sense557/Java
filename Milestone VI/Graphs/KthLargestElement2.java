//Approach 2 Using Minheap

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for(int num:nums){
            minheap.add(num);
            if(minheap.size() > k){
                minheap.remove();
            }
        }

        return minheap.peek();
    }
}
