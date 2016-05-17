import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by caowei on 16/5/17.
 */
public class Solution283 {

    public static void main(String[] args) {
        Solution283 solution283 = new Solution283();

        int nums[] = {0, 0, 0, 1, 0, 3, 12};
        solution283.moveZeroes(nums);

    }

    /**
     *我的方法,效率很低
     */
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0; ; ){
            if(nums[i]==0){
                int tmp = nums[i];
                for(int j=i;j<nums.length;j++){
                    if(j!=nums.length-1){
                        nums[j] = nums[j+1];
                    }else{
                        nums[j] = tmp;
                    }

                }
            }
            if(nums[i]!=0){
                i++;
            }else{
                count++;
            }
            if(count+i>=nums.length){
                break;
            }
        }

        System.out.print(Arrays.toString(nums));
    }



    /**
     *别人的方法
     */
    public void moveZeroes2(int[] nums) {

        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
        }

        for(int i=index;i<nums.length;i++){
            nums[i]=0;
        }

        System.out.print(Arrays.toString(nums));
    }
}
