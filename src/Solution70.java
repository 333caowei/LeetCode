/**
 * Created by caowei on 16/5/29.
 */
public class Solution70 {

    public static void main(String args[]){
        Solution70 solution70 = new Solution70();


        int n = solution70.climbStairs(2);
        System.out.print(n);
    }

    /**
     * 自己用的递归实现,但是提交代码出现超时
     */
//    public int climbStairs(int n) {
//        if(n==0){
//            return 1;
//        }else if(n<0){
//            return 0;
//        }
//
//        int onew_way   = climbStairs(n-1);
//        int second_way = climbStairs(n-2);
//
//        return  onew_way + second_way;
//
//    }


    /**
     *http://blog.csdn.net/fly_yr/article/details/47788617
     */
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }else if(n<0){
            return 0;
        }

        int step[] = new int[n];
        step[0] = 1;
        step[1] = 2;
        for(int i=2;i<step.length;i++){
            step[i] = step[i-1] + step[i-2];
        }

        return  step[n-1];

    }
}
