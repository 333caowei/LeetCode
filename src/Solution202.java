import java.util.HashSet;
import java.util.Map;

/**
 * Created by caowei on 16/5/30.
 */
public class Solution202 {

    public static void main(String args[]){
        Solution202 solution202 = new Solution202();


        int n=7;
        boolean isHappy = solution202.isHappy(n);
        System.out.print(isHappy);
    }

    public boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<Integer>();

        while(true){
            String string = String.valueOf(n);
            char number[] = string.toCharArray();
            int sum=0;
            for(int i=0;i<number.length;i++){
                sum+= Math.pow(Integer.parseInt(String.valueOf(number[i])), 2);
            }
            if(sum==1){
                return true;
            }else{
                if(hashSet.contains(sum)){
                    return false;
                }else{
                    hashSet.add(sum);
                    n=sum;
                }

            }
        }

    }
}
