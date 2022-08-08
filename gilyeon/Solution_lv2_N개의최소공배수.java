import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr); // 가장 큰 수를 찾기 위해 정렬
        int max = arr[arr.length-1]; // 배열의 수 중 가장 큰 수
        int t = 1; // 곱할 수
        int count;
        while(true){
            count = 0;
            answer = max * t; // 가장 큰 수에 1부터 곱해주기
            for(int i = 0; i < arr.length-1; i++){
                if(answer % arr[i] == 0)
                    count++; // answer이 가장 큰 수를 제외한 수의 배수인지 count
            }
            if(count == arr.length-1){ // answer이 가장 큰 수를 제외한 모든 수의 배수라면 break
                break;
            }
            t++;
        }

        return answer;
    }
}