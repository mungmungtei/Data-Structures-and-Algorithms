class Solution {
    public int solution(String s) {
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i = 0; i <10; i++) {
            s = s.replace(word[i], num[i]);  // replace(원래 값, 바꿀 값)
        }

        return Integer.parseInt(s);  // 문자열 -> 숫자로 바꾸기
    }
}
