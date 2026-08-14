package java;
class Solution {
    public int[] twoSum(int[] nums, int target) {
    
       int array_length=nums.length;
        for(int i=0;i<array_length;i++)
        {
            for(int j=i+1;j<array_length;j++)
            {
                if(nums[i]+nums[j]==target){
               System.out.println("the indices which add upto target is " + i + ", " + j);
               return new int[]{i,j};
        }
            }
        
        }
     return new int[]{};
}
}