class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int light = 0, heavy = tokens.length - 1;
        int score = 0, max_score = 0;

        while(light <= heavy){
            if(power >= tokens[light]){
                score += 1;
                power -= tokens[light];
                max_score = Math.max(score, max_score);
                light++;
            }else if(score>=1){
                score -= 1;
                power += tokens[heavy];
                heavy --;
            }else{
                break;
            }
        }
        return max_score;
    }
}
