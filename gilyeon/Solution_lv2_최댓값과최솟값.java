import java.util.*;
class Solution {
/*	split를 쓰면 배열만 사용해서 훨씬 쉽게 풀 수 있었을 문제. 
	그래도 hastokens와 collenction을 다시 한번 배울 수 있었다! */
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s);
        ArrayList<Integer> arr = new ArrayList<>();
        while(st.hasMoreTokens()){ // 다음 토큰이 있다면,
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr); // 배열리스트 오름차순 정렬
        answer += arr.get(0);
        answer += " ";
        answer += arr.get(arr.size()-1);
        return answer;
    }
}