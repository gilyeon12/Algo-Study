class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        // 자릿수 합 구하기
        String str = String.valueOf(x); // int형 -> String형
        int sum = 0; // 자릿수의 합
        for(int i = 0; i < str.length(); i++){
            sum += str.charAt(i) - '0';
        }
        // 자릿수 합이 나누어 떨어지는지 확인.
        if(x % sum != 0)
            answer = false;
        return answer;
    }
}