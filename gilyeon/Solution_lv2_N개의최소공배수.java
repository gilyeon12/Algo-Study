import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr); // ���� ū ���� ã�� ���� ����
        int max = arr[arr.length-1]; // �迭�� �� �� ���� ū ��
        int t = 1; // ���� ��
        int count;
        while(true){
            count = 0;
            answer = max * t; // ���� ū ���� 1���� �����ֱ�
            for(int i = 0; i < arr.length-1; i++){
                if(answer % arr[i] == 0)
                    count++; // answer�� ���� ū ���� ������ ���� ������� count
            }
            if(count == arr.length-1){ // answer�� ���� ū ���� ������ ��� ���� ������ break
                break;
            }
            t++;
        }

        return answer;
    }
}