import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majority(new int[] {1,1,2,2,2,2,5,5,5,5,9,9,9,9,9,9,9}));
    }

    public static int majority(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            if(map.containsKey(num)) {
              map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }

        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }
}