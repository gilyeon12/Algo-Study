import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> arr = new ArrayList<>();
        int [] num1 = {1, 2, 3, 4, 5};
        int [] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int [] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int [] count = new int[3];

        // �ѹ����� ä���ϱ�	
        for(int i = 0; i < answers.length; i++){ // �̶� �������������� ���־� ��Ģ�� ó������ �ٽ� �ǵ�������.
            if(answers[i] == num1[i%num1.length])
                count[0]++;
            if(answers[i] == num2[i%num2.length])
                count[1]++;
            if(answers[i] == num3[i%num3.length])
                count[2]++;

        }

        // �ִ� ���ϱ�
        int max = -1;
        for(int i = 0; i < 3; i++){
            if(count[i] > max)
                max = count[i];
        }
        for(int i = 0; i < 3; i++){
            if(count[i] == max)
                arr.add(i);
        }

        // �迭����Ʈ -> �迭�� ��ȯ.
        int [] answer = new int[arr.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i) + 1;
        }
        return answer;
    }
}