import java.util.Arrays;
class Solution{
// A배열의 최솟값과 B배열의 최댓값의 곱을 더해주기
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++){
            answer += (A[i] * B[B.length-1-i]);
        }

        return answer;
    }
}