import java.util.*;
class Solution {
//	���� �ݺ��� ���� ȿ���� 0, �� �迭�� �����ؼ� �ݺ����� �ϳ��� ���� �ٸ� ���� ã�� ������� �ذ�
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i; // �ݺ��� �ۿ� �����ؼ� �ݺ����� ����� ������ ����� �� ����.
        for(i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i]; // �ٷ� return �ؾ��� ������ �����ϸ� ������,,(���� �𸣰���)
            }
        }
        return participant[i];
    }
}