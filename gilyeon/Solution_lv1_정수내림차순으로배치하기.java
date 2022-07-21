import java.util.Arrays;
class Solution {
    /* �����ϰ� Ǯ� �� �����ϰ� Ǭ �ڵ带 �����ؾ߰���.
        long�� -> String�� -> int�� -> String�� -> long��
    */
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n); // long�� -> String��
        int [] arr = new int[str.length()]; // �ڸ����� ���� int�� �迭
        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i) - '0'; 
        }
        Arrays.sort(arr); // ������������ ����.
        
        StringBuilder sb = new StringBuilder(); // ������������ �����ϱ� ���� sb ����.
        for(int i = 0; i < str.length(); i++){
            sb.append(arr[i]);
        }
        // ������������ ������ string���� long������ ��ȯ.
        answer = Long.parseLong(sb.reverse().toString());
        return answer;
    }
}