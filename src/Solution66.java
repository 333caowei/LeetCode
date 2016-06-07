import java.util.Arrays;

/**
 * Created by caowei on 16/6/7.
 */
public class Solution66 {

    public static void main(String args[]){
        Solution66 solution66 = new Solution66();

//        int [] array = {1,9,9};
        int [] array = {9,9,9};

        int result[] = solution66.plusOne(array);
        System.out.print(Arrays.toString(result));
    }


    /**
     *有三种情况,第一种直接+1
     * 第二种+1后产生进位,但是总长度不变
     * 第二种+1后产生进位,并且总长度会增加一位
     */
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9 && i==0){
                digits[i]=0;
                digits = new int[digits.length+1];
                digits[0]=1;
                break;
            }else if(digits[i]==9 && i>0){
                digits[i]=0;
            }else{
                digits[i]=digits[i]+1;
                break;
            }
        }

        return digits;

    }


}
