class Solution {
    /* 행렬의 구조가 잘 이해가 되지 않아 이해하는데만 해도 어려웠다. */
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = arr1; // arr1과 같으므로 대입.

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }
}