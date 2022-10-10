class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        int zcnt = 0; // 제거한 0의 개수의 총합
        int cnt = 0; // 계산한 회차
        while(true){
            int one_cnt = 0; // 1의 개수
            for(int i = 0; i < s.length(); i++){ // 1의 개수 구하기
                char c = s.charAt(i);
                if(c == '1'){
                    one_cnt++;
                }
            }
            int zero_cnt = s.length()-one_cnt; // 제거한 0의 개수
            String binary_cal = Integer.toBinaryString(one_cnt); // 이진 변환 결과
            cnt++;
            zcnt += zero_cnt;
            if(binary_cal.equals("1")) // 종료 조건
                break;
            s = binary_cal; // 새로운 이진수 대입해주기
        }
        answer[0] = cnt;
        answer[1] = zcnt;
        return answer;
    }
}