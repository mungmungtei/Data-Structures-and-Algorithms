import java.util.*;

class Solution {
    public boolean solution(int[] lotto) {
        boolean answer = true;
        
        // int[]를 HashSet으로 바꿔서 중복 제거하기
        Set<Integer> set = new HashSet<>();
        for(int l : lotto) {
            set.add(l);
        }
        // HashSet에 담긴 숫자가 6개가 아니면 false 반환
        if (set.size() != 6) {
            answer = false;
        }
        return answer;
    }
}
