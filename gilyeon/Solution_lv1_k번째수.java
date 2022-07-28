import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int t = 0; t < commands.length; t++ ){
            int i = commands[t][0];
            int j = commands[t][1];
            int k = commands[t][2];
            
            int[] temp = new int[j-i+1]; // 정렬할 배열.
            for(int r = 0; r < temp.length; r++){
                temp[r] = array[i-1+r]; 
            }
            Arrays.sort(temp);
            answer[t] = temp[k-1];
        }
        return answer;
    }
}