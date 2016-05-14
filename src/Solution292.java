/**
 * Created by caowei on 16/5/14.
 */
public class Solution292 {

    public static void main(String[] args) {
        Solution292 solution292 = new Solution292();

        int n = 4;

        solution292.canWinNim(n);
    }

    /**
     *纸上写出来找规律
     */
    public boolean canWinNim(int n) {
        if(n%4==0)
            return false;
        else
            return true;
    }
}
