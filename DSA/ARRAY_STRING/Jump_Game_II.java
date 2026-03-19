public class Jump_Game_II {
    public static void main(String[] args) {
        Jump_Game_II obj = new Jump_Game_II();
        int[] nums = {2,3,1,1,4};
        System.out.println(obj.jump(nums));
    }
    
    public int jump(int[] nums) {
        if(nums.length == 1) return 0;

        int jump = 0, farthest = 0, current = 0;

        for(int i=0;i<nums.length-1;i++)
        { 
            farthest = Math.max(farthest, i+nums[i]);
            if(current==i)
            {
                jump++;
                current = farthest;
            }
        }
        return jump;
    }
}