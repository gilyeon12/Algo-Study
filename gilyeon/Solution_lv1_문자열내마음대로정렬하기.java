import java.util.*;
class Solution {
    /* �ε��� 1�� ���ڰ� ���� ���ڿ��� ���� �� ���, ���������� �ռ� ���ڿ��� ���ʿ� ��ġ�մϴ�.
       --> �� ������ ��� ó���ұ�?????
       --> �� ���� strings�迭�� ������������ �����ϸ� �ذ�!!!
    */
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        Arrays.sort(strings); // ���������� ���� ����.

        for(int i = 0; i < strings.length; i++){
            answer[i] = strings[i].substring(n, n+1); // �ε��� n�� ���� ��������.
        }

        Arrays.sort(answer); // �ε��� n ��ġ�� ���� �������� ����.

        // strings�迭�� ArrayList������ ����. (asList ���)
        List<String> list = new ArrayList<>(Arrays.asList(strings)); 

        for(int i = 0; i < answer.length; i++){ // ���� �ݺ������� �ε��� n�� ��ġ�� ������ Ȯ����
            for(int j = 0; j < list.size(); j++){ // �ش� ���ڿ����� �Ǻ�.
                if(list.get(j).substring(n, n+1).equals(answer[i])){ 
                    answer[i] = list.get(j); // ������ answer�迭�� ����.
                    list.remove(list.get(j)); // ����Ʈ������ ����. �Ȱ��� �ܾ ����Ǵ� ���� ���� �� ��
                    break;
                }
            }
        }

        return answer;
    }
}