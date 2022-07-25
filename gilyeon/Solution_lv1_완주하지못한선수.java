import java.util.*;
class Solution {
//	이중 반복문 쓰면 효율성 0, 두 배열을 정렬해서 반복문을 하나만 돌려 다른 값을 찾는 방식으로 해결
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i; // 반복문 밖에 선언해서 반복문을 벗어나도 변수를 사용할 수 있음.
        for(i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i]; // 바로 return 해야지 변수에 저장하면 오류남,,(이유 모르겠음)
            }
        }
        return participant[i];
    }
}