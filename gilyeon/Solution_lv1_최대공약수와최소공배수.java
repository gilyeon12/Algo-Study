class Solution {
    /* �˻��ϴ� ��Ŭ���� ȣ�������� ���� Ǯ����, �� ������ ������ �ȳ���
       �׳� �ݺ������� Ǯ����. */
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        // answer�迭 �ʱ�ȭ
        answer[0] = 1;
        answer[1] = m*n;
        
        // �־��� �� ���� ������ �������ٸ� �ٷ� answer����.
        if(max % min == 0){
            answer[0] = min;
            answer[1] = max;
        }
        else{ // ������ �������� ������ 1���� ū ������ �ϳ��ϳ� ������.
            for(int i = 1; i < max; i++){
                if(max % i == 0 && min % i == 0){
                answer[0] = i;
                answer[1] = (m*n)/i; // �ּҰ���� ����
                }
            }
        }
        return answer;
    }
}