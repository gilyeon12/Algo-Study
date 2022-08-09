class Solution {
/* 몇 개의 수를 더해야 하는지 정해지지 않아서 while문을 썻지만, 더해진 수(temp)는 주어진 수 n보다 크면 안되기 때문에 for문을 써서 해결해도 상관없었을 것이다. ------> 횟수, 조건이 있으면 for문 */
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        for(int i = 1; i <= n; i++){ // 더해지는 수의 시작값을 1씩 늘려준다.
            int idx = i; 
            int temp = 0; // 더해진 수 (비교값)
            while(true){ // ex) 1+2+3+..., 2+3+4+..., 3+4+5+...
                temp += idx;
                if(temp == n){ // 종료 조건 1. 더해진 수가 n과 같다면 answer를 1 올리고 break.
                    answer++;
                    break;
                }
                else if(temp > n){ // 종료 조건 2. 더해진 수가 n보다 크다면 바로 break.
                    break;
                }
                idx++;
            }
        }
        return answer;
    }
}