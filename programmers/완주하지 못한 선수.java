import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Map<String, Integer> map = new HashMap<>();
        
	// 모든 참가자들에게 '1' 값을 부여하기 (동명이인이 있으면 +1 씩)
        for(String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
	// 완주자들에 한해서 '1' 값을 '0'으로 바꿔주기
        for(String player : completion) {
            map.put(player, map.get(player) - 1);
        }
        // 값이 '0'이 아닌 참가자를 리턴해주기
        String answer = "";
        for(String name : map.keySet()) {
            if(map.get(name) != 0) {
                answer = name;
            }
        }
        return answer;
    }
}
