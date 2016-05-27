/**
 * Created by caowei on 16/5/27.
 */
public class Solution191 {

    public static void main(String args[]){
        Solution191 solution191 = new Solution191();

        int n = 00000000000000000000000000001011;
        int result = solution191.hammingWeight(n);
        System.out.print(result);
    }

    /**
     * 看了解析才做出来的
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        int count=0;
        int m=1;
        for(int i=0;i<32;i++){
            if((n&m)!=0){
                count++;
            }
            m=m<<1;
        }
        return count;
    }
}
