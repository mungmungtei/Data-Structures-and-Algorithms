import java.util.*;

class Solution {
    public boolean solution(String[] words) {
        
        // 끝말 잇기가 되는지 확인
        for(int i = 0; i < words.length-1; i++) {
         if(words[i].charAt(words[i].length()-1) != words[i+1].charAt(0))
                return false;
        }
        // 중복된 단어가 있는지 확인
        Set<String> set = new HashSet<>();
        for(String w : words) {
            set.add(w);
        }
        if (set.size() != words.length) {
            return false;
        } else {
            return true;
        }
    }
}
