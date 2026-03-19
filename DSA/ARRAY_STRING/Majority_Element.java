public class Majority_Element {
    public static void main(String[] args) {
        Majority_Element obj = new Majority_Element();
        int[] nums = {3,2,3};
        System.out.println(obj.majorityElement(nums));
    }

    public int majorityElement(int[] nums) {
        int freq = 0, ans = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(freq==0)
            {
                ans = nums[i];
            }
            if(ans == nums[i])
            {
                freq++;
            }
            else
            {
                freq--;
            }
        }
        return ans;
    }
}
