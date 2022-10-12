class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        for(int i = 0; i < words.length; i++){
            if(words[i].length() <= 1){ // ���� 1. �� ���� �̻��̾�� �Ѵ�.
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                return answer;
            }
            
            if(i >= 1){ // ���� 2. ���� �ܾ��� ������ ���� = ���� �ܾ��� ù ����
                if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                    return answer;
                }
            }
            
            for(int j = 0; j < i; j++){ // ���� 3. ���� ���� �ܾ�� �� ���ϸ� �ȵȴ�.
                if(words[i].equals(words[j])){
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                    return answer;
                }
            }
        }
        return answer;
    }
}