class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' ') {  // 공백 처리.
                answer += " ";
                continue;   
            }
            else{
                if(c >= 'A' && c <= 'Z'){ // 대문자
                    if(c+n > 'Z') // Z라면 A로 되돌려주기.
                        answer += (char)(c-26+n);
                    else
                        answer += (char)(c+n);
                }
                else if(c >= 'a' && c <= 'z'){ // 소문자
                    if(c+n > 'z') // z라면 a로 되돌려주기.
                        answer += (char)(c-26+n);
                    else
                        answer += (char)(c+n);
                }
            }
        }   
        return answer;
    }
}