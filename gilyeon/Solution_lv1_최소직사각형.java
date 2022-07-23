class Solution {
    /* 발상의 전환 : 가로는 전부 큰 값, 세로는 전부 작은 값으로 바꿔놓으면 최대값을 구할 수 있다. 
        근데 이걸 생각해내는 과정이 어려움. */

    public int solution(int[][] sizes) {
        int answer = 0;
        // 왼쪽은 큰 값, 오른쪽은 작은 값으로 바꿔주기.
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
        }

        // 최대값 구하기.
        int wmax = 0;
        int hmax = 0;
        for(int i = 0; i < sizes.length; i++){
            if(wmax < sizes[i][0])
                wmax = sizes[i][0];
            if(hmax < sizes[i][1])
                hmax = sizes[i][1];
        }

        answer = wmax * hmax;
        return answer;
    }
}