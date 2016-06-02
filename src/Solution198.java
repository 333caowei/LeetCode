import java.util.Arrays;

/**
 * Created by caowei on 16/6/2.
 */
public class Solution198 {

    public static void main(String args[]){
        Solution198 solution198 = new Solution198();

        int number[] = {1,2,4,2,7,3};

        int result = solution198.rob(number);
        System.out.print(result);
    }

    /**
     * 没做出来 这是解析
     * http://blog.csdn.net/lu597203933/article/details/44810981
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }

        int not_choose_current  = 0;
        int is_choose_current = 0;
        for(int i=0;i<nums.length;i++){
            int temp = not_choose_current;
            not_choose_current = Math.max(not_choose_current, is_choose_current);
            is_choose_current  = temp + nums[i];
        }

        return Math.max(not_choose_current, is_choose_current);
    }
}
