class Solution {
    /* ����� ������ �� ���ذ� ���� �ʾ� �����ϴµ��� �ص� �������. */
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = arr1; // arr1�� �����Ƿ� ����.

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }
}