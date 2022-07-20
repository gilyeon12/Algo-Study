import java.util.*;
class Solution {
    /* 인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
       --> 이 조건은 어떻게 처리할까?????
       --> 맨 먼저 strings배열을 오름차순으로 정리하면 해결!!!
    */
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        Arrays.sort(strings); // 사전순으로 먼저 정리.

        for(int i = 0; i < strings.length; i++){
            answer[i] = strings[i].substring(n, n+1); // 인덱스 n의 문자 가져오기.
        }

        Arrays.sort(answer); // 인덱스 n 위치의 문자 오름차순 정렬.

        // strings배열을 ArrayList형으로 변경. (asList 사용)
        List<String> list = new ArrayList<>(Arrays.asList(strings)); 

        for(int i = 0; i < answer.length; i++){ // 이중 반복문으로 인덱스 n의 위치가 같은지 확인해
            for(int j = 0; j < list.size(); j++){ // 해당 문자열인지 판별.
                if(list.get(j).substring(n, n+1).equals(answer[i])){ 
                    answer[i] = list.get(j); // 맞으면 answer배열에 저장.
                    list.remove(list.get(j)); // 리스트에서는 제거. 똑같은 단어가 저장되는 것을 피할 수 있
                    break;
                }
            }
        }

        return answer;
    }
}