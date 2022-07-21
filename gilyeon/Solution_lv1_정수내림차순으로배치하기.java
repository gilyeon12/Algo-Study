import java.util.Arrays;
class Solution {
    /* 복잡하게 풀어서 더 간단하게 푼 코드를 참고해야겠음.
        long형 -> String형 -> int형 -> String형 -> long형
    */
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n); // long형 -> String형
        int [] arr = new int[str.length()]; // 자릿수를 담을 int형 배열
        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i) - '0'; 
        }
        Arrays.sort(arr); // 오름차순으로 정렬.
        
        StringBuilder sb = new StringBuilder(); // 내림차순으로 정리하기 위해 sb 선언.
        for(int i = 0; i < str.length(); i++){
            sb.append(arr[i]);
        }
        // 내림차순으로 정렬한 string형을 long형으로 변환.
        answer = Long.parseLong(sb.reverse().toString());
        return answer;
    }
}