import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int index = 0;

        for (int i = people.length - 1; i >= index; i--) { // 가장 큰 수부터 시작
            if (people[i] + people[index] <= limit) {
                index++; // idx 2개 건너뛰기
                answer++;
            }
            else {
                answer++;
            }
        }
        return answer;
    }
}