class Solution {
    public int solution(int n) {
        int answer = 1; // 15=15와 같이 자기 자신은 항상 포함
        int cal = 0;
        for(int i = 1; i < n; i++){ // 맨 처음 계산을 시작하는 숫자
            for(int j = 0; i < n; j++){ // 1씩 더해주기 위한 반복문
                cal += (i + j);
                if(cal == n){
                    answer++;
                    cal = 0;
                    break;
                }
                if(cal > n){ // 계산한 값이 n보다 크다면 바로 break
                    cal = 0;
                    break;
                }
            }
        }
        return answer;
    }
}