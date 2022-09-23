import java.util.*;  // HashSet 클래스 써야하니 import 잊지 않기

class Solution {
 public int solution(int[] nums) {

    int max = nums.length / 2;

    // 중복 제거하기 위해 Set 인터페이스를 구현한 HashSet 클래스 사용
    HashSet<Integer> numsSet = new HashSet<>();

    for (int num : nums) {
      numsSet.add(num);
    }

    // 중복 제거한 numsSet의 크기가 max보다 크면 max를, 작거나 같으면 numsSet의 size를 리턴
    if (numsSet.size() > max) {
      return max;
    } else {
      return numsSet.size();
    }
  }   
}
