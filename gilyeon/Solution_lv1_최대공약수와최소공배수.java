class Solution {
    /* 검색하니 유클리드 호제법으로 많이 풀던데, 난 도저히 생각이 안나서
       그냥 반복문으로 풀었다. */
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        // answer배열 초기화
        answer[0] = 1;
        answer[1] = m*n;
        
        // 주어진 두 값이 나누어 떨어진다면 바로 answer저장.
        if(max % min == 0){
            answer[0] = min;
            answer[1] = max;
        }
        else{ // 나누어 떨어지지 않으면 1부터 큰 값까지 하나하나 나눠봄.
            for(int i = 1; i < max; i++){
                if(max % i == 0 && min % i == 0){
                answer[0] = i;
                answer[1] = (m*n)/i; // 최소공배수 공식
                }
            }
        }
        return answer;
    }
}