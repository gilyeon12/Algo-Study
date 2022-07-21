class Solution {
    /* 홀수일 때 num의 값이 매우 커져버려 int형 범위를 넘어가게 되므로
       long형으로 선언해줘야 함. */
    public int solution(int num) {
        int answer = 0;
        long l = (long)num; // num을 담은 long형 변수

        for(int i = 0; i < 500; i++){
            if(l == 1){
                answer += i;
                break;
            }
            if(l % 2 == 0)
                l = l / 2;
            else
                l = l * 3 + 1;
        }

        if(l != 1)
            answer = -1;
        
        return answer;
    }
}