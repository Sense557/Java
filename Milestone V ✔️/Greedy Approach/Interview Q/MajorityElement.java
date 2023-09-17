public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int maj = nums[0], majCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == maj) {
                majCount++;
            } else {
                majCount--;
                if (majCount == 0) {
                    maj = nums[i];
                    majCount = 1;
                }
            }
        }
        return maj;
    }
    public static void main(String[] args) {
        int nums [] = {2, 1, 2};
        System.out.println(majorityElement(nums));
    }
}
