class Solution {
    /* 문제 설명 : "각 단어는 하나 이상의 공백문자로 구분되어 있습니다."" 주의!!!!
        그럼 공백이 꼭 하나가 아니라 여러개일 수도 있다는 말!
        따라서 split함수의 limit를 음수로 해 모든 공백을 구분자로 나눠줘야함!!! */
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ", -1); // 공백 기준으로 단어 나누기
        // split의 두번째인자인 limit를 음수로 주면 모든 구분값을 나눠서 배열로 반환함
        for(int i = 0; i < str.length; i++){
            String word = str[i]; // 각 단어
            for(int j = 0; j < word.length(); j++){ // 각 단어 변환.
                String temp = word.substring(j, j+1); // 한 글자씩 저장.(char형이 아닌)
                if(j % 2 == 0) // 짝수면 대문자로
                    answer += temp.toUpperCase();
                else // 홀수면 소문자로
                    answer += temp.toLowerCase();
            }
            if(i == str.length - 1) // 마지막 공백 출력 안하기
                break;
            answer += " ";
        }
        return answer;
    }
}