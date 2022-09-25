import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        Arrays.sort(phone_book);
        boolean answer = true;
        
        // 배열을 하나씩 돌면서 n+1번째 문자열이 n번째 문자열을 접두사로 갖고 있는지 확인 
        // 마지막 요소는 비교 대상이 없으니깐 length-1 길이만 돌면 됨
	// 비교대상 문자열.startsWith.(문자열 접두사) 
        for(int i = 0; i < phone_book.length-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                answer = false;
            }
        }
        return answer;
    }
}
