class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        // �ڸ��� �� ���ϱ�
        String str = String.valueOf(x); // int�� -> String��
        int sum = 0; // �ڸ����� ��
        for(int i = 0; i < str.length(); i++){
            sum += str.charAt(i) - '0';
        }
        // �ڸ��� ���� ������ ���������� Ȯ��.
        if(x % sum != 0)
            answer = false;
        return answer;
    }
}