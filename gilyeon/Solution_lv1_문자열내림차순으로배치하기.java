import java.util.*;
class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray(); // string�� char�迭�� �����.
        Arrays.sort(arr); // �������� ����
        
        StringBuilder sb = new StringBuilder();
        
        // Stringbuilder�� Char�迭 ����.
        for(int i = 0; i < s.length(); i++){
            sb.append(arr[i]);
        }
        
        
        return sb.reverse().toString(); // �������� ���(���ڿ���).
    }
}