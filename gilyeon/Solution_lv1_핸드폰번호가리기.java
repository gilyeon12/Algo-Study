class Solution {
    public String solution(String phone_number) {
        String answer = "";
        // 별 찍기
        for(int i = 0; i < phone_number.length()-4; i++){
            answer += '*';
        }
        // 뒷 4자리 번호는 그대로
        for(int i = 0; i < 4; i++){
            answer += phone_number.charAt(phone_number.length()-4 + i);
        }
        return answer;
    }
}