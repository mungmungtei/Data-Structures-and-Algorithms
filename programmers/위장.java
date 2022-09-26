import java.util.*;

class Prac03 {

    public int solution(String[][] clothes) {

        // 1. 의상 종류 별 개수 구하고 + 1 (해당 종류의 의상을 안 입는 상황) 해주기 
        Map<String, Integer> map = new HashMap<>();

        for(String[] c : clothes) {
            String type = c[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // 2. 1에서 나온 값들을 곱해주기 (경우의 수를 구하기 위해)
        int answer = 1;
        Iterator<Integer> iter = map.values().iterator();

        while(iter.hasNext()) {
            answer *= iter.next() + 1;
        }

        // 3. 2에서 나온 값에 -1 (아무 종류의 의상도 안 입은 상황) 해주기
        return answer -1;
    }

    public static void main(String[] args) {
        Prac03 prac03 = new Prac03();
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(prac03.solution(clothes));
    }
}
