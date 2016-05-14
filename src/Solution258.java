/**
 * Created by caowei on 16/5/14.
 */
public class Solution258 {

    public static void main(String[] args) {
        Solution258 solution258 = new Solution258();

        int num = 9534;

        int x = solution258.addDigits(num);
        System.out.print(x);
    }


    /**
     * 我是使用递归来做的,把数字转换成字符数组,然后先判断数组长度如果是1,则返回,
     * 否则将字符数组每一个都转换成整型然后相加,
     * 相加后的结果再进行递归
     */
    public int addDigits(int num) {
        String numString = String.valueOf(num);
        char numCharArray[] = numString.toCharArray();

        if(numCharArray.length==1) {
            return Integer.parseInt(String.valueOf(numCharArray[0]));
        }
        else{
            int sum=0;
            for(int i=0;i<numCharArray.length;i++){
                sum+=Integer.parseInt(String.valueOf(numCharArray[i]));
            }
            return addDigits(sum);
        }


    }

}
