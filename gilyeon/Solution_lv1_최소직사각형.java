class Solution {
    /* �߻��� ��ȯ : ���δ� ���� ū ��, ���δ� ���� ���� ������ �ٲ������ �ִ밪�� ���� �� �ִ�. 
        �ٵ� �̰� �����س��� ������ �����. */

    public int solution(int[][] sizes) {
        int answer = 0;
        // ������ ū ��, �������� ���� ������ �ٲ��ֱ�.
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
        }

        // �ִ밪 ���ϱ�.
        int wmax = 0;
        int hmax = 0;
        for(int i = 0; i < sizes.length; i++){
            if(wmax < sizes[i][0])
                wmax = sizes[i][0];
            if(hmax < sizes[i][1])
                hmax = sizes[i][1];
        }

        answer = wmax * hmax;
        return answer;
    }
}