class Solution {
    /* ���� ���� : "�� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�."" ����!!!!
        �׷� ������ �� �ϳ��� �ƴ϶� �������� ���� �ִٴ� ��!
        ���� split�Լ��� limit�� ������ �� ��� ������ �����ڷ� ���������!!! */
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ", -1); // ���� �������� �ܾ� ������
        // split�� �ι�°������ limit�� ������ �ָ� ��� ���а��� ������ �迭�� ��ȯ��
        for(int i = 0; i < str.length; i++){
            String word = str[i]; // �� �ܾ�
            for(int j = 0; j < word.length(); j++){ // �� �ܾ� ��ȯ.
                String temp = word.substring(j, j+1); // �� ���ھ� ����.(char���� �ƴ�)
                if(j % 2 == 0) // ¦���� �빮�ڷ�
                    answer += temp.toUpperCase();
                else // Ȧ���� �ҹ��ڷ�
                    answer += temp.toLowerCase();
            }
            if(i == str.length - 1) // ������ ���� ��� ���ϱ�
                break;
            answer += " ";
        }
        return answer;
    }
}