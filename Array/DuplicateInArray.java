public class DuplicateInArray {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[] {4,3,1,3,2}));
    }

    public static int findDuplicate(int nums[]) {
        int duplicate = -1;
        for (int i = 0; i < nums.length; i++) {
            int cur = Math.abs(nums[i]);
            if (nums[cur] < 0) {
                duplicate = cur;
                break;
            }
            nums[cur] *= -1;
        }

         
        // Restore numbers
        // for (int i = 0; i < nums.length; i++) {
        //     nums[i] = Math.abs(nums[i]);
        //     System.out.println(nums[i]);
        // }
        return duplicate;
    }

    // 2nd methode
    /* Arrays.sort(nums);
        for(int i=1;i<nums.length;i++) {
            if(nums[i] == nums[i-1]) {
                return nums[i];
            }
        }
        
        return -1;
    */

    // 3rd methode 
    /* public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num))
                return num;
            seen.add(num);
        }
        return -1;
    }
    */
}