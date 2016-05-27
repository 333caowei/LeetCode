/**
 * Created by caowei on 16/5/27.
 */
public class Solution263 {

    public static void main(String[] args) {
        Solution263 solution263 = new Solution263();

        int nums = 8;
        boolean isUgly = solution263.isUgly(nums);
        System.out.print(isUgly);

    }


    public boolean isUgly(int num) {
        if(num==2){
            return true;
        }else if(num==3){
            return true;
        }else if(num==5){
            return true;
        }else if(num==1 || num==0){
            return true;
        }else if(num==0){
            return false;
        }

        if(num%2==0){
            return isUgly(num/2);
        }else if(num%3==0){
            return isUgly(num/3);
        }else if(num%5==0){
            return isUgly(num/5);
        }
        return false;
    }

}
