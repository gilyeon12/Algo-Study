import java.util.*;
class Solution {
/*	split�� ���� �迭�� ����ؼ� �ξ� ���� Ǯ �� �־��� ����. 
	�׷��� hastokens�� collenction�� �ٽ� �ѹ� ��� �� �־���! */
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s);
        ArrayList<Integer> arr = new ArrayList<>();
        while(st.hasMoreTokens()){ // ���� ��ū�� �ִٸ�,
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr); // �迭����Ʈ �������� ����
        answer += arr.get(0);
        answer += " ";
        answer += arr.get(arr.size()-1);
        return answer;
    }
}