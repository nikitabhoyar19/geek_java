import java.util.ArrayList;
import java.util.List;

// here we are finding two majority elements which has count more than n/3
public class MajorityElement2 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {2, 3, 2, 5, 5, 5, 9, 9, 9, 9, 5}));
    }

    public static List<Integer> majorityElement(int[] nums) {
        int ele1 = 0, ele2 = 0, count1 = 0, count2 = 0;

        for(int n: nums) {
            if(n == ele1) {
                count1++;
            }
            else if(n == ele2) {
                count2++;
            }

            else if(count1 == 0) {
                ele1 = n;
                count1++;
            }

            else if(count2 == 0) {
                ele2 = n;
                count2++;
            }

            else {
                count1--;
                count2--;
            }
        }

        // verification step 
        count1 = 0;
        count2 = 0;
        
        for(int n: nums) {
            if(n == ele1) {
                count1++;
            }
            else if(n == ele2) {
                count2++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        if(count1 > nums.length / 3) {
            ans.add(ele1);
        }

        if(count2 > nums.length / 3) {
            ans.add(ele2);
        }

        return ans;
    }
}