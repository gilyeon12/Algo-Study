import java.util.*;
class Solution {
/* �������� ���� ���̽��� ã�Ƽ� �ذ��ϴ°� �ʹ� �������. �迭 ����Ʈ���� ���� ����� ������ �ʹ� ����� ����� ���� �� ���⵵ �ϴ�. */
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost); // �������� ����
        Arrays.sort(reserve); // �������� ����

        // lost, reserve �迭�� ���� �迭 ����Ʈ ����
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i : lost)
            ll.add(i);
        ArrayList<Integer> rl = new ArrayList<>();
        for(int i : reserve)
            rl.add(i);

        for(int i = 0; i < rl.size(); i++){ // �켱, �� �迭����Ʈ�� ���� �� ����
            for(int j = 0; j < ll.size(); j++){
                if(rl.get(i) == ll.get(j)){
                    rl.remove(i);
                    ll.remove(j);
                    i--; // ������ ������ ����Ʈ�� size�� ���������� ���ϹǷ� Ƚ���� ���ҽ��������!
                    break;
                }
            }
        }

        for(int i = 0; i < rl.size(); i++){ // �� ��ȣ Ȥ�� �� ��ȣ ü���� �����ֱ�
            for(int j = 0; j < ll.size(); j++){
                if(rl.get(i) - 1 == ll.get(j) || rl.get(i) + 1 == ll.get(j)){
                    ll.remove(j); // ���⼭�� ��ó�� rl.remove�ؼ� i--�ص� �ǰ�, �׳� ���� ����� �������൵ ��.
	     // ���� ���� ����̶� ������ ��� �Ѵ� �����߾�� �ϹǷ� �ݵ�� rl.remove�� ����� ��!
                    break;
                }
            }
        }

        answer = n - ll.size();
        return answer;
    }
}