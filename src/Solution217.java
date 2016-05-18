import java.util.HashMap;

/**
 * Created by caowei on 16/5/18.
 */
public class Solution217 {

    public static void main(String args[]){
        Solution217 solution217 = new Solution217();
        int nums[] = {1,2,0,3,4,3};

        boolean isDuplicate = solution217.containsDuplicate(nums);
        System.out.print(isDuplicate);
    }


    /**
     *使用hashmap保存已经遍历保存
     */
    public boolean containsDuplicate(int[] nums) {
        boolean isDuplicate = false;
        HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();

        for(int i=0;i<nums.length;i++){
            if(hashMap.get(nums[i])==null){
                hashMap.put(nums[i],true);
            }else if(hashMap.get(nums[i])==true){
                isDuplicate = true;
                break;
            }
        }

        return isDuplicate;
    }



}
