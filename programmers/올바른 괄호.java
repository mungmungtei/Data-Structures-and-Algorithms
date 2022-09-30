class Solution {
    boolean solution(String s) {
       
        // for문 돌면서 '('가 나오면 +1씩, 아니라면 -1씩 
        // 처음에 ')'가 나오면 안되니깐 그 경우에는 바로 false를 리턴 
        int i = 0; 
        for(char c : s.toCharArray()) {
            if (c == '(') {
                i++;
            } else {
                if (i == 0) return false;
                i--;
            }
        }
        // true를 리턴
        return i == 0;
    }
}
