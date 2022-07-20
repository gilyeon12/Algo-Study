import java.util.*;
class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray(); // string을 char배열로 만든다.
        Arrays.sort(arr); // 오름차순 정렬
        
        StringBuilder sb = new StringBuilder();
        
        // Stringbuilder에 Char배열 저장.
        for(int i = 0; i < s.length(); i++){
            sb.append(arr[i]);
        }
        
        
        return sb.reverse().toString(); // 역순으로 출력(문자열로).
    }
}