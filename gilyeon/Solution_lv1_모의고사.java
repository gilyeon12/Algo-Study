import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> arr = new ArrayList<>();
        int [] num1 = {1, 2, 3, 4, 5};
        int [] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int [] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int [] count = new int[3];

        // 한문제씩 채점하기	
        for(int i = 0; i < answers.length; i++){ // 이때 나머지연산으로 해주어 규칙을 처음부터 다시 되돌려야함.
            if(answers[i] == num1[i%num1.length])
                count[0]++;
            if(answers[i] == num2[i%num2.length])
                count[1]++;
            if(answers[i] == num3[i%num3.length])
                count[2]++;

        }

        // 최댓값 구하기
        int max = -1;
        for(int i = 0; i < 3; i++){
            if(count[i] > max)
                max = count[i];
        }
        for(int i = 0; i < 3; i++){
            if(count[i] == max)
                arr.add(i);
        }

        // 배열리스트 -> 배열로 변환.
        int [] answer = new int[arr.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i) + 1;
        }
        return answer;
    }
}