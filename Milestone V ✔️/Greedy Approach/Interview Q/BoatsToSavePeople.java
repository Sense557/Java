class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int light = 0, heavy = people.length - 1, boatCount = 0;
        while(light <= heavy){
            if(people[light] + people[heavy]<=limit){
                light++;
                heavy--;
            }else{
                heavy--;
            }
            boatCount++;
        }
        return boatCount;
    }
}
