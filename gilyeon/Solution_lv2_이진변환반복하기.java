class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        int zcnt = 0; // ������ 0�� ������ ����
        int cnt = 0; // ����� ȸ��
        while(true){
            int one_cnt = 0; // 1�� ����
            for(int i = 0; i < s.length(); i++){ // 1�� ���� ���ϱ�
                char c = s.charAt(i);
                if(c == '1'){
                    one_cnt++;
                }
            }
            int zero_cnt = s.length()-one_cnt; // ������ 0�� ����
            String binary_cal = Integer.toBinaryString(one_cnt); // ���� ��ȯ ���
            cnt++;
            zcnt += zero_cnt;
            if(binary_cal.equals("1")) // ���� ����
                break;
            s = binary_cal; // ���ο� ������ �������ֱ�
        }
        answer[0] = cnt;
        answer[1] = zcnt;
        return answer;
    }
}