class Solution {
    /* Ȧ���� �� num�� ���� �ſ� Ŀ������ int�� ������ �Ѿ�� �ǹǷ�
       long������ ��������� ��. */
    public int solution(int num) {
        int answer = 0;
        long l = (long)num; // num�� ���� long�� ����

        for(int i = 0; i < 500; i++){
            if(l == 1){
                answer += i;
                break;
            }
            if(l % 2 == 0)
                l = l / 2;
            else
                l = l * 3 + 1;
        }

        if(l != 1)
            answer = -1;
        
        return answer;
    }
}