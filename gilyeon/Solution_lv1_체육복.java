import java.util.*;
class Solution {
/* 여러가지 엣지 케이스를 찾아서 해결하는게 너무 어려웠다. 배열 리스트말고 쉬운 방법이 많은데 너무 어려운 방법을 택한 것 같기도 하다. */
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost); // 오름차순 정렬
        Arrays.sort(reserve); // 오름차순 정렬

        // lost, reserve 배열을 담을 배열 리스트 생성
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i : lost)
            ll.add(i);
        ArrayList<Integer> rl = new ArrayList<>();
        for(int i : reserve)
            rl.add(i);

        for(int i = 0; i < rl.size(); i++){ // 우선, 두 배열리스트에 같은 값 제거
            for(int j = 0; j < ll.size(); j++){
                if(rl.get(i) == ll.get(j)){
                    rl.remove(i);
                    ll.remove(j);
                    i--; // 제거할 때마다 리스트의 size가 유동적으로 변하므로 횟수를 감소시켜줘야함!
                    break;
                }
            }
        }

        for(int i = 0; i < rl.size(); i++){ // 앞 번호 혹은 뒷 번호 체육복 빌려주기
            for(int j = 0; j < ll.size(); j++){
                if(rl.get(i) - 1 == ll.get(j) || rl.get(i) + 1 == ll.get(j)){
                    ll.remove(j); // 여기서는 위처럼 rl.remove해서 i--해도 되고, 그냥 빌린 사람만 제거해줘도 됨.
	     // 위는 빌린 사람이랑 빌려준 사람 둘다 제거했어야 하므로 반드시 rl.remove를 해줘야 함!
                    break;
                }
            }
        }

        answer = n - ll.size();
        return answer;
    }
}