class Solution {
    public int solution(int n) {
        int answer = 1; // 15=15�� ���� �ڱ� �ڽ��� �׻� ����
        int cal = 0;
        for(int i = 1; i < n; i++){ // �� ó�� ����� �����ϴ� ����
            for(int j = 0; i < n; j++){ // 1�� �����ֱ� ���� �ݺ���
                cal += (i + j);
                if(cal == n){
                    answer++;
                    cal = 0;
                    break;
                }
                if(cal > n){ // ����� ���� n���� ũ�ٸ� �ٷ� break
                    cal = 0;
                    break;
                }
            }
        }
        return answer;
    }
}