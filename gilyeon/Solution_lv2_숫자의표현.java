class Solution {
/* �� ���� ���� ���ؾ� �ϴ��� �������� �ʾƼ� while���� ������, ������ ��(temp)�� �־��� �� n���� ũ�� �ȵǱ� ������ for���� �Ἥ �ذ��ص� ��������� ���̴�. ------> Ƚ��, ������ ������ for�� */
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        for(int i = 1; i <= n; i++){ // �������� ���� ���۰��� 1�� �÷��ش�.
            int idx = i; 
            int temp = 0; // ������ �� (�񱳰�)
            while(true){ // ex) 1+2+3+..., 2+3+4+..., 3+4+5+...
                temp += idx;
                if(temp == n){ // ���� ���� 1. ������ ���� n�� ���ٸ� answer�� 1 �ø��� break.
                    answer++;
                    break;
                }
                else if(temp > n){ // ���� ���� 2. ������ ���� n���� ũ�ٸ� �ٷ� break.
                    break;
                }
                idx++;
            }
        }
        return answer;
    }
}