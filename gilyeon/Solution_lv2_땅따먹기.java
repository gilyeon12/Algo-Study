class Solution {
    int solution(int[][] land) {
//  dp 알고리즘 : 한 열씩 내려갈 때마다 나올 수 있는 최대값 계산하기
        int answer = 0;
        for(int i = 1; i < land.length; i++){
            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
            land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
            land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));
        }

        for(int i = 0; i < 4; i++){
            if(land[land.length-1][i] > answer)
                answer = land[land.length-1][i];
        }

        return answer;
    }
}