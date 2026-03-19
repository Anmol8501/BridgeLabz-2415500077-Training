public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        Remove_Duplicates_from_Sorted_Array obj = new Remove_Duplicates_from_Sorted_Array();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length = obj.removeDuplicates(nums);
        System.out.println("Length of array after removing duplicates: " + length);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }
}
