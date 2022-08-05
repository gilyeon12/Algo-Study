class Solution {
/* 이중 반복문으로도 풀리는 줄 알았으나 잘못 생각 ------> 삼중 반복문으로 풀어야 한다
이유? i에 대한 곱, j에 대한 곱을 따로따로 하나씩 구해야 하기 때문!! 행렬의 곱셈에 대한 이해도가 필요하다. */
 
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer[0].length; j++){
                int sum = 0;
                for(int k = 0; k < arr2.length; k++){
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;    
            }
        }
        return answer;
    }
}