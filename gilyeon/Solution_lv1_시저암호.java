class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' ') {  // ���� ó��.
                answer += " ";
                continue;   
            }
            else{
                if(c >= 'A' && c <= 'Z'){ // �빮��
                    if(c+n > 'Z') // Z��� A�� �ǵ����ֱ�.
                        answer += (char)(c-26+n);
                    else
                        answer += (char)(c+n);
                }
                else if(c >= 'a' && c <= 'z'){ // �ҹ���
                    if(c+n > 'z') // z��� a�� �ǵ����ֱ�.
                        answer += (char)(c-26+n);
                    else
                        answer += (char)(c+n);
                }
            }
        }   
        return answer;
    }
}