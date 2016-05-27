/**
 * Created by caowei on 16/5/27.
 */
public class Solution326 {

    public static void main(String args[]){
        Solution326 solution326 = new Solution326();

        int n=9;
        boolean isPowerOfThree = solution326.isPowerOfThree(n);
        System.out.print(isPowerOfThree);
    }

    public boolean isPowerOfThree(int n) {
        if((n%3==0 && n==3) || n==1){
            return true;
        }else if(n%3==0 && n>3){
            return isPowerOfThree(n/3);
        }
        return false;

    }
}
