import java.util.Arrays;

/**
 * Created by caowei on 16/6/7.
 */
public class Solution27 {

    public static void main(String args[]){
        Solution27 solution27 = new Solution27();

        int []array = {3,2,2,3};
        int val     = 3;
        int i = solution27.removeElement(array, val);
        System.out.print(i);

    }


    /**
     * 题目的意思是返回去掉指定元素后的数组长度,
     * 比如:[3,2,2,3] 3
     * 返回2,表示数组变成[2,2,3,3],数组长度为2,只包含前两个数字
     */
    public int removeElement(int[] nums, int val) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int f_index = 0;
        int b_index = nums.length;
        while(f_index<b_index){
            if(nums[f_index] == val){
                int temp = nums[b_index-1];
                nums[b_index-1] = nums[f_index];
                nums[f_index] = temp;
                b_index--;
            }else{
                f_index++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return b_index;


    }


}
