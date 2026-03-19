public class Remove_Duplicates_from_Sorted_Array_II {
    public static void main(String[] args) {
        Remove_Duplicates_from_Sorted_Array_II obj = new Remove_Duplicates_from_Sorted_Array_II();
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int k = obj.removeDuplicates(nums);
        System.out.println("Length after removing duplicates: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int k = 2;

        for(int i=2;i<nums.length;i++)
        {
            if(nums[i] != nums[k-2])
            {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
