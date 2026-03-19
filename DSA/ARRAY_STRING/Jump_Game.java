public class Jump_Game {
    public static void main(String[] args) {
        Jump_Game obj = new Jump_Game();
        int[] nums = {2,3,1,1,4};
        System.out.println(obj.canJump(nums));
    }
    
    public boolean canJump(int[] nums) {
        int goal = nums.length-1;

        for(int i=nums.length-1;i>=0;i--)
        {
            if(i + nums[i] >= goal)
            {
                goal = i;
            }
        }
        return goal == 0;
    }
}
