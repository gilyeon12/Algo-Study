class Solution {
    public long solution(long n) {
        long answer = -1;
        for(long i = 1; i <= Math.sqrt(n); i++){ // i값 자체가 비교값이 되므로 이것도 long형으로 선언해줘야함!!(안그럼 오류)
            if(n == i*i){
                answer = (i+1)*(i+1);
                break;
            }
        }
        return answer;
    }
}