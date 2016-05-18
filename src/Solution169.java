import java.util.HashMap;

/**
 * Created by caowei on 16/5/18.
 */
public class Solution169 {

    public static void main(String args[]){
        Solution169 solution169 = new Solution169();
        int nums[] = {3,3,4};

        int n = solution169.majorityElement(nums);
        System.out.print(n);
    }


    /**
     * 使用hashmap,保存每一个数出现的次数
     * 然后找出出现次数最多的数
     *
     */
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++){
            if(hashMap.get(nums[i])==null){
                hashMap.put(nums[i],1);
            }else{
                int count = hashMap.get(nums[i]);
                hashMap.put(nums[i], ++count);
            }
        }

        int majorityElementIndex=0;
        int maxValue=0;
        for(int i=0;i<nums.length;i++){
            int value = hashMap.get(nums[i]);
            if(value>maxValue){
                maxValue = value;
                majorityElementIndex=nums[i];
            }
        }

        return majorityElementIndex;
    }
}
