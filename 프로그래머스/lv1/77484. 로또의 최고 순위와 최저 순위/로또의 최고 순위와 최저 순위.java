class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero=0;
        int count=0;
        
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0){
                zero ++;
            }
        }
        
        for(int i=0; i<lottos.length; i++){
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    count++;
                }
            }
        }
        answer[0] = zero + count;
        answer[1] = count;
        
        for(int i=0; i<2; i++){
            if(answer[i] == 6) answer[i] = 1;
            else if(answer[i] == 5) answer[i] = 2;
            else if(answer[i] == 4) answer[i] = 3;
            else if(answer[i] == 3) answer[i] = 4;
            else if(answer[i] == 2) answer[i] = 5;
            else answer[i] = 6;
        }
        
        return answer;
    }
}